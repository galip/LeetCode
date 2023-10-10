-- https://leetcode.com/problems/managers-with-at-least-5-direct-reports/
select emp.name from employee emp where emp.id in 
(select e.managerId from employee e 
group by e.managerId
having count(*) >= 5)