-- https://leetcode.com/problems/user-activity-for-the-past-30-days-i/
select a.activity_date day, count(distinct a.user_id) active_users 
from activity a
where a.activity_date between date_sub('2019-07-27', interval 29 day) and '2019-07-27'
group by a.activity_date