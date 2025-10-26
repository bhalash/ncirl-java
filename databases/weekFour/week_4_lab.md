# Week 4 Lab Work

Learning Goal – Understanding entities, attributes & relationships

A DVD rental company has several branches throughout the country. The data held
on each branch is the branch address made up of street, city, county, post code
and telephone number.

Each branch is given a branch number which is unique throughout the company.
Each branch is allocated staff which includes a Manager. The Manager is
responsible for the day-to-day running of a given branch.

The data held on a member of staff is their staff id (which is unique), name,
position and salary.

Each branch has a stock of DVDs. The data held on each DVD is the catalog number
(which is a unique number), DVD number (which represents the number of existing
copies of that DVD), title and category and status (whether it is currently
available to rent).

Before borrowing a DVD from the company a person must first register as a member
of a local branch. The data held on each member is first name, last name,
address, registration date. Each member is given a unique membership number.

The data held on each DVD rental is the rental number, the full name and
membership number of the member, the DVD number, title and the dates the DVD is
rented and returned.

## Tasks

1. Identify the entities
2. Identify the attributes and relationships

## Entities

- `branches`
- `managers` (employees <> branches)
- `dvds`
- `members`
