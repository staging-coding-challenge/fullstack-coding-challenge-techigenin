drop table grocery_list_items;
select setval('grocery_item_num_seq', 1, false);

create table grocery_item (
	num serial primary key,
	name varchar,
	type varchar
);

create table grocery_list_items (
	item_id 	varchar primary key,
	list_num 	integer,
	item_num	integer,
	count		integer
);

alter table grocery_list_items 
	add foreign key (item_num) 
		references grocery_item(num);

truncate table grocery_list_items;
truncate table grocery_item cascade;
	
insert into grocery_item
	(name, type)
		values
			('milk', 'grocery');
insert into grocery_item
	(name, type)
		values
			('socks', 'clothing');
insert into grocery_item
	(name, type)
		values
			('hat', 'clothing');
insert into grocery_item
	(name, type)
		values
			('soccer ball', 'toy');


		
select * from grocery_item;
		
	
insert into grocery_list_items 
	(item_id, list_num, item_num, count)
		values 
			('1-1', 1, 1, 5);
insert into grocery_list_items 
	(item_id, list_num, item_num, count)
		values 
			('1-2', 1, 2, 1);
insert into grocery_list_items 
	(item_id, list_num, item_num, count)
		values 
			('1-4', 1, 4, 1);
insert into grocery_list_items 
	(item_id, list_num, item_num, count)
		values 
			('2-1', 2, 1, 1);
			
select * from grocery_list_items;