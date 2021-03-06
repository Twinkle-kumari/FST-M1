Activity8

select customer_id,max(purchase_amount) "Highest Purchase Amount" from orders
group by customer_id;

select customer_id,max(purchase_amount) "Highest Purchase Amount" from orders where order_date = TO_DATE('2012-08-17', 'YYYY/MM/DD')
group by customer_id;

select customer_id, order_date,max(purchase_amount) "Highest Purchase Amount" from orders 
group by customer_id,order_date having max(purchase_amount) in (2030, 3450, 5760, 6000);
