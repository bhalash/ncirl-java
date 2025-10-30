# Enhanced Entity Relationship Modelling

Enhanced Entity Relationship models are high-level data models that incorporate extensions to the original ER model.

Three of the most important and useful additional concepts of the EER model include Specialization/Generalization, `Superclass` and `Aggregation`.

## Specialization/Generalization 
The concept of specialization/generalization is associated with special types of entities known as  superclasses and subclasses and the process of attribute inheritance. 

A `superclass`  is an entity type that includes one or more distinct subgroupings of its occurrences, which must be represented in the data model.

A `superclass/subclass relationsip` is a distinct subgrouping of occurrence of an entity type, which must be represented in a data model.

Example entities that are members of the Staff entity type may be classified as Manager, SalesPerson and Secretary (see diagram). Staff is the `superclasss` and SalesPerson, Manager and Secretary are its `subclassses`.

The relationship between a superclass and any of its subclasses is a one-to-one relationship and is called a `specialization`.

The subclasses inherit all the attributes from the superclass and may also define their own distinctive attributes.

Staff is a `superclass` of Manager, SalesPerson and Secretary.
Manager, SalesPerson and Secretary are all `subclasses` of Staff.

It can be thought of as an IS-A relationship.

There are two constraints that may apply to a specialization/generalization called participation constraints and disjoint constraints.

`Participation constraint`  determines whether every member in the superclass must participate as a member of a subclass. A participation constraint may be `mandatory` or `optional`. Mandatory specifies that every member in the superclass must also be a member in the subclass. Optional specifies that a member of a superclass need not belong to any of its subclasses.

For example, is it possible to have staff entity occurrences or is it mandatory for each entity occurrence to be a Manager, SalesPerson or Secretary duties.

------------  describes the relationship between members of the subclasses and indicates whether it is possible for a member of a superclass to be a member of one or more subclasses. For example, is it possible for an entity occurrence to be a Manager and a SalesPerson?

## Aggregation
`Aggregation` represents a "has-a" or "is-part-of" relationship between entity types where one represents the `generalization` and the other the `generalization`.

### Example 

- a branch has staff, staff is part of a branch
- car has a wheel, a wheel is part of a car

## Composition
Composition is a `specific form of aggregation`  that represents an association between entities where there is a strong ownership and coincidental lifetime between the "whole" and the "part".

### Example

- a heart is a part of a body (a heart can only be part of one person’s body)
- an advert is displayed in a Newspaper

With specialization/generalization, aggregation and composition the option to use and extent to which they are used are subjective decisions. It is worth remembering the purpose of conceptual data modelling is to allow database designers and end users to unambiguously and accurately communicate their understanding. Therefore, with this in mind specialization/generalization should only be used when it is to complex to understand using the basic components of ER models. Furthermore, aggregation and composition should only be used where there is a requirement to emphasise a special relationship.
