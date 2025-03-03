# Write your MySQL query statement below
SELECT name as 'Customers' from customers WHERE ID NOT IN (SELECT customerId from orders);