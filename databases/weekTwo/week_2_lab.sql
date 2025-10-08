-- 1.     Select all from the Person table
select * from `Person`;

-- 2.     Select all addresses from the Person table
select address from `Person`;

-- 3.     Select all first names and last names from the Person table
select fName,lName from `Person`;

-- 4.    Select all persons whose surname is Bow, Brown or Byrne
select * from `Person` where lName in ('Bow', 'Brown', 'Bryne');

-- 5.    Select all persons who are less than 30
select * from `Person` where Age < 30;

-- 6.    Change Molly Peter’s last name from ‘Peter’ to ‘Peters’
-- mark: molly is pID 1
update `Person` set lName = 'Peters' where pID = 1;

-- 7.    Delete ‘John White’ from the table
-- mark: john is pID 4
delete from `Person` where pID = 4;

-- 8.    Insert a new person into the table – Nell Tate, 28, Pine Needle Avenue
insert into `Person` (fName, lName, age, address) values ('Nell', 'Tate', 28, 'Pine Needle Avenue');
