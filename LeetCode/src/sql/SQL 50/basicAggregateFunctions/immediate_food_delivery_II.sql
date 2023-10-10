-- https://leetcode.com/problems/immediate-food-delivery-ii/
select round(
(
select count(*) from (
select (d.customer_id) from delivery d
group by d.customer_id
having min(d.order_date) = min(d.customer_pref_delivery_date)) t) * 100 / count(distinct customer_id), 2)immediate_percentage
from delivery