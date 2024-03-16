-- https://leetcode.com/problems/game-play-analysis-iv/
select round(count(distinct act1.player_id) / (select count(distinct act2.player_id) from activity act2), 2)
as fraction
from activity act1
where (player_id, date_sub(event_date, interval 1 DAY))
in (select player_id, min(event_date) from activity group by player_id)