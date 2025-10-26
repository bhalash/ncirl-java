# Identifying Entites, Attributes and Relationships

Learning goal: understanding how identify entities their attributes and
relationships between entities.

McFarm’s company comprise several departments. Each department employs a number
of employees, but employees can only work for one department. The company name,
address email and telephone number are stored. Department details comprise
department name, code and budget. Employees, name, id, date of birth, title and
start date are stored.

## Step 1: Identify Entities
List all the entities described in the scenario.

### Primary

- `Company`
- `Employee`
- `Department`

### Secondary/Joins

- `CompanyDepartment` - one-to-many relationship between `Company` and `Department`.
- `CompanyEmployee` - one-to-many relationship between `Company` and `Employee`.

## Step 2: Identify Attributes
List each entity and its attributes.

### `companies`

- `id`
- `created_at`
- `updated_at`
- `name`
- `email_address`
- `telephone_number`

### `employees`

- `id`
- `created_at`
- `updated_at`
- `name`
- `salutation` - the mention of "title" in the problem was IMO ambiguous.
- `date_of_birth`

### `departments`

- `id`
- `created_at`
- `updated_at`
- `code`
- `name`
- `budget`

## Step 3: Identify Relationships
We would prefer joins in Rails, over FKs on records. They give us far more
flexibility to create new migrations, while avoiding unnecessary crap on the
primary record.

### `company_departments`
One-to-many between `companies` and `departments`: a company has many
departments, whilst a department has one company.

- `company_id`
- `department_id`
- `created_at`
- `updated_at`

### `company_employees`
One-to-many between `companies` and `employees`: a company has many
employees, whilst an employee has one company.

- `company_id`
- `employee_id`
- `created_at` - synonymous with hire date
- `updated_at`
- `title`

### `department_employees`
One-to-many between `departments` and `employees`: a department has many
employees, whilst an employee has one department.

- `department_id`
- `employee_id`
- `created_at`
- `updated_at` 
