-- https://leetcode.com/problems/second-highest-salary/
select max(salary) as SecondHighestSalary from employee where
salary not in(select max(salary) from employee);