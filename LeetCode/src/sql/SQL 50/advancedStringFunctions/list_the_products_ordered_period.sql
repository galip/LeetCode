-- https://leetcode.com/problems/list-the-products-ordered-in-a-period/
select p.product_name product_name, sum(o.unit) unit from products p, orders o
where p.product_id = o.product_id
and month(o.order_date) = '02'
and year(o.order_date) = '2020'
group by p.product_id
having sum(o.unit) >= 100