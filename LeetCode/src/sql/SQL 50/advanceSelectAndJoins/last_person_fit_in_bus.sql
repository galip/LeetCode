-- https://leetcode.com/problems/last-person-to-fit-in-the-bus
select person_name from
(select person_name, turn, sum(weight)
over (order by turn) as total 
from queue) p1
where total <= 1000
order by total desc
limit 1