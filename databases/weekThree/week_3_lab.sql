-- 1. Add a new column dateOfBirth to the Person table
alter table `Person` add column dateOfBirth varchar(33);

-- 2. Add another new column phoneNumber to the Person class. Delete the column phoneNumber from the Person table
alter table `Person` add column phoneNumber varchar(32);
alter table `Person` drop phoneNumber;

-- 3. Create a new table Pet with two attributes petID and petType
create table `Pets` (
  petID int,
  petType varchar(16)
);

-- 4. Delete the Pet table from the database.
drop table `Pets`;
