-- https://leetcode.com/problems/product-sales-analysis-iii
select distinct s.product_id, s.year as first_year, s.quantity, s.price 
from sales s
where 
((s.product_id, year) 
in (select s2.product_id, min(year) 
from sales s2 group by s2.product_id))