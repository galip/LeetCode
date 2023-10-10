-- https://leetcode.com/problems/percentage-of-users-attended-a-contest/
select 
r.contest_id contest_id, 
round((count(r.contest_id)/(select count(t.user_id) from users t)) * 100, 2)  percentage 
from register r
join users u on
r.user_id = u.user_id
group by r.contest_id
order by percentage desc, r.contest_id asc