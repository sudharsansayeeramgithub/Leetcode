# Write your MySQL query statement below
SELECT Product_id,10 AS price FROM Products WHERE Product_id NOT IN(SELECT DISTINCT Product_id FROM Products WHERE change_date<='2019-08-16')
UNION
SELECT Product_id,new_price AS price FROM Products WHERE (Product_id,change_date) IN (SELECT Product_id,MAX(change_date) FROM Products WHERE change_date<='2019-08-16' GROUP BY Product_id);