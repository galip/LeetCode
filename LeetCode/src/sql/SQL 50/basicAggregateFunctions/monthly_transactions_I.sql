-- https://leetcode.com/problems/monthly-transactions-i/
select date_format(t.trans_date, "%Y-%m") month, t.country,
count(t.id) trans_count,
sum(case when t.state = 'approved' then 1 else 0 end) approved_count,
sum(t.amount) trans_total_amount,
sum(case when t.state = 'approved' then t.amount else 0 end) approved_total_amount
from transactions t
group by date_format(t.trans_date, "%Y-%m"), t.country