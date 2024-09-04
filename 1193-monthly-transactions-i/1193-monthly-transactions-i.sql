# Write your MySQL query statement below
SELECT 
    DATE_FORMAT(trans_date,'%Y-%m') as month,
    country,
    COUNT(trans_date) AS trans_count,
    COUNT(CASE WHEN state='approved' THEN 1 END ) AS approved_count,
    SUM(amount) AS trans_total_amount,
    IFNULL(SUM(CASE WHEN state='approved' THEN amount END),0) AS approved_total_amount 
FROM 
    Transactions 
GROUP BY 
    DATE_FORMAT(trans_date,'%Y-%m'),country;