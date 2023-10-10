-- https://leetcode.com/problems/find-followers-count/
select distinct f.user_id, count(distinct(f.follower_id)) followers_count 
from followers f
group by f.user_id
order by f.user_id