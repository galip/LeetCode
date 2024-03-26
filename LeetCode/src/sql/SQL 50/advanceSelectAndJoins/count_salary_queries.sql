--https://leetcode.com/problems/count-salary-categories
select 'Low Salary' as category, sum(income < 20000) accounts_count from accounts
union
select 'Average Salary' as category, sum(income >= 20000 and income <= 50000) accounts_count from accounts
union
select 'High Salary' as category, sum(income > 50000) accounts_count from accounts