# Write your MySQL query statement below
select e.employee_id from employees e where 
e.salary < 30000 and
not exists 
(select 1 from employees emp where emp.employee_id = e.manager_id)
and e.manager_id is not null
order by e.employee_id