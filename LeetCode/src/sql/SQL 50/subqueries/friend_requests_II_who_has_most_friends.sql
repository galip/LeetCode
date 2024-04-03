-- https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends
select id, count(*) as num from
(
select requester_id as id from requestAccepted
union all
select accepter_id as id from requestAccepted
) as count
group by id
order by num desc
limit 1;