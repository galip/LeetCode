-- https://leetcode.com/problems/number-of-unique-subjects-taught-by-each-teacher/
select t.teacher_id, count(distinct t.subject_id) cnt from teacher t
group by t.teacher_id