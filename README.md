# oca-preparation
Some examples and documents to prepare for OCA certification.

# Chapter 4

## Default Constructor
- A constructor without parameters that is provided, if no constructor is provided by the programmer

## this()
- this() can be used to call another constructor from within a constructor
- this() must be the first noncommented statement in the constructor

## Order of Initialization
1. If there is a superclass, initialize it first
1. Static variable declarations and static initializers in the order they appear in the file
1. Instance variable declarations and instance initializers in the order they appear in the file
1. The constructor

## Naming conventions for Java Beans
- Proterties are private
- Getter methods begin with is if the property is a boolean
- Getter methods begin with get if the property is not a boolean
- Setter methods begin with set
- The method name must have a prefix of set/get/is followed by the property name written in camel case

## Lambdas
- The removeIf() method on ArrayList takes a Predicate

Bookmark 235 "Extending a Class"
