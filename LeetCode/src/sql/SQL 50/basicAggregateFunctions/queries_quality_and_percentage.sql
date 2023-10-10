-- https://leetcode.com/problems/queries-quality-and-percentage/
select q.query_name, round(avg(q.rating/q.position), 2) quality,
round(avg(q.rating < 3) * 100, 2) poor_query_percentage
from queries q
group by q.query_name