# Write your MySQL query statement below
select e.name as "Employee" from Employee e
 join Employee e1
 on e.managerID=e1.Id
 where e.salary>e1.salary