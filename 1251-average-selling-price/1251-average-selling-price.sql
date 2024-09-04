SELECT Prices.product_id,ifnull(round(sum(prices.price*UnitsSold.units)/sum(UnitsSold.units),2),0) as average_price
FROM Prices INNER JOIN 
UnitsSold ON Prices.product_id=UnitsSold.product_id
AND UnitsSold.purchase_date BETWEEN Prices.start_date AND Prices.end_date
GROUP BY Prices.product_id;