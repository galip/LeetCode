-- https://leetcode.com/problems/movie-rating
(select name as results from movieRating
join users using(user_id)
group by name
having count(*) = 
(select count(*) from movieRating
group by user_id 
order by count(*) desc
limit 1)
order by name
limit 1)
union all
(select title as results from movieRating
join movies using(movie_id)
where  EXTRACT(YEAR_MONTH FROM created_at) = 202002
group by title
having avg(rating) = 
(select avg(rating) from movieRating
where EXTRACT(YEAR_MONTH FROM created_at) = 202002
group by movie_id
order by avg(rating) desc
limit 1)
order by title
limit 1)