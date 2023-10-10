-- https://leetcode.com/problems/classes-more-than-5-students/
select c.class from Courses c 
group by c.class
having count(distinct(c.student)) >= 5