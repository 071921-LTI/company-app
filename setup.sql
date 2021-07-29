drop table if exists tasks;
drop table  if exists employees;

create table if not exists employees(
	empl_id SERIAL primary key,
	empl_name VARCHAR(50) not null,
	empl_salary NUMERIC(7,2),
	empl_role VARCHAR(20),
	empl_email VARCHAR(75) unique,
	empl_pass VARCHAR(50) not null check (length(empl_pass) > 7),
	manager_id INTEGER references employees(empl_id)
);

create table if not exists tasks(
	task_id SERIAL primary key,
	task_name VARCHAR(30),
	task_description text,
	completion_status VARCHAR(10),
	assign_date DATE,
	due_date DATE,
	empl_id INTEGER references employees(empl_id)
);

insert into employees (empl_name, empl_salary, empl_role, empl_email, empl_pass, manager_id) values ('Black-tailed deer', 57209.07, 'Nurse ', 'dpenswick1@omniture.com', 'jathFmUDCbL', 1);