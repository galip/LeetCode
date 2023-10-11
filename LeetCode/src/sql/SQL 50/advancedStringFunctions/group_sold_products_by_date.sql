-- https://leetcode.com/problems/group-sold-products-by-the-date/
select to_CHAR(sell_date, 'YYYY-MM-DD') sell_date, count(*) num_sold, LISTAGG(product, ',' ) 
within group (order by product) products
from (select distinct product, sell_date from Activities)
group by sell_date
order by 1