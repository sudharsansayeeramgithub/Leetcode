# Write your MySQL query statement below
select employee.name,b.bonus from Employee employee left join Bonus b on employee.empId=b.empId where b.bonus<1000 or b.bonus is null;