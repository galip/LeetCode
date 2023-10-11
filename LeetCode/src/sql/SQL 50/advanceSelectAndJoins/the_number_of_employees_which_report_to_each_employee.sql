-- https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/
select 
e.employee_id, 
e.name, 
count(e2.employee_id) reports_count, 
round(avg(e2.age)) average_age
from employees e
inner join employees e2
on e.employee_id = e2.reports_to
group by e.employee_id
order by e.employee_id