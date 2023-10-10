-- https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/
select customer_id, count(*) count_no_trans 
from visits v
left join transactions t on
t.visit_id = v.visit_id
where t.visit_id is null
group by customer_id