-- https://leetcode.com/problems/biggest-single-number/
select max(num) num 
from 
(select m.num from MyNumbers m
group by m.num
having count(m.num) = 1) as num