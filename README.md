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

# Chapter 5

## Constructor Definition Rules:
1. The first statement of every constructor is a call to another constructor within the class using this() , or a call to a constructor in the direct parent class using super() .
1. The super() call may not be used after the first statement of the constructor.
1. If no super() call is declared in a constructor, Java will insert a no-argument super() as the first statement of the constructor.
1. If the parent doesn’t have a no-argument constructor and the child doesn’t define any constructors, the compiler will throw an error and try to insert a default no-argument constructor into the child class.
1. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit call to a parent constructor in each child constructor.

## Rules for Overriding Methods
1. The method in the child class must have the same signature as the method in the parent class.
1. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
1. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
1. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.

## Issues
__P. 237__ "The default package private modifi er, which is the lack of any access modifi er,
indicates the class can be accessed only by a subclass or class within the same package."

Looks like the class itself is only available in the same package. See code example _chapter5/class-access-modifiers_

Bookmark 254 "Overriding vs. Hiding Methods"
