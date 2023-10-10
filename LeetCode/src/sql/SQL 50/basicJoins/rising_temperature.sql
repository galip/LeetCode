-- https://leetcode.com/problems/rising-temperature/submissions/962523396/?envType=study-plan-v2&envId=top-sql-50
select w.id from weather w, weather x 
where w.temperature > x.temperature
and datediff(w.recordDate, x.recordDate) = 1