# oca-preparation
Some examples and documents to prepare for OCA certification.

# Chapter 1

## Valid Identifiers

Identifiers may contain letters, numbers, $, or \_. Identifiers may not begin with numbers.

## Order of Elements in a Class

| Element             | Example             | Required       | Where does it go?             |
| :-------------      | :-------------      | :------------- | :-------------                |
| Package declaration | package abc;        | No             | First line in file            |
| Import statements   | import java.util.*; | No             | Immediately after the package |
| Class declaration   | public class C      | Yes            | Immediately after the import  |
| Field declarations  | int value;          | No             | Anywhere inside a class       |
| Method declarations | void method()       | No             | Anywhere inside a class       |

Think of the acronym PIC (picture): Package, import, and class.

## finalize()

- Any class can implement a finalize method to do cleanup work
- Method is called when an object is collected by the garbage collector
- Method is called 0 or 1 time
- Calling System.gc() suggests that Java might wish to run the garbage collector
- Java is free to ignore the request

## Benefits of Java

__Object Oriented__ Java is an object-oriented language. It allows for functional programming within a class, but object oriented is still the main organization of code.

__Encapsulation__ Java supports access modifiers to protect data from unintended access and modification.

__Platform Independent__ Java is an interpreted language because it gets compiled to bytecode. This bytecode is than interpreted by the JVM. ("Write once, run everywhere") This has some limitations but if you get asked on the OCA exam, the same \*.class file runs everywhere.

__Robust__ One of the major advantages of Java over C++ is that it prevents memory leaks. Java manages memory on its own and does garbage collection automatically.

__Simple__ Java was intended to be simpler than C++. Java does not contain
- Pointers
- Operator overloading

__Secure__ Java code runs inside the JVM. This creates a sandbox that makes it hard for Java code to do evil things to the computer it is running on.

# Chapter 2

## Numeric Promotion Rules

1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
1. If one of the values is integral and the other is floating point, Java will automatically promote the integral value to the floating-point value's data type.
1. Smaller data types, namely byte, short, and char, are first promoted to int any time they're used with a Java binary arithmetic operator, even if neither of the operands is int.
1. After all promotion has occured and the operands have the same type, the resulting int value will have the same data type as its promoted operands.

## Compound Operators

When using compound operators one has to bear in mind that even _lossy_ conversions are done.

```Java
long l = 1L;
int i = 1;
i = i + l; // DOES NOT COMPILE (no automatic cast due to possible lossy conversion)
i += l; // DOES COMPILE (compound operator does even lossy conversions)
```

## If Statement

In an if-else-if statement only the first successful condition is executed.

## Switch Statement

Data types supported by switch statements include the following
- int and Integer
- byte and Byte
- short and Short
- char and Character
- String
- enum values

Note that boolean and long, and their associated wrapper classes, are not supported by switch statements.

## For Statement

Note the fact that the components of the for loop are each optional. The semicolons separating the tree sections are required though.

```Java
// an infinite loop
for ( ; ; ) {
  System.out.println("Hello World");
}
```

## Labels

|                | Allows optional labels | Allows break statement | Allows continue statement |
| :------------- | :-------------         | :-------------         | :-------------            |
| if             | Yes*                   | No                     | No                        |
| while          | Yes                    | Yes                    | Yes                       |
| do while       | Yes                    | Yes                    | Yes                       |
| for            | Yes                    | Yes                    | Yes                       |
| switch         | Yes                    | Yes                    | No                        |

\* Labels are allowed for any block statement, including those that are preceded with an if-then statement.

# Chapter 3

## Rules For Using The '+' Operator

1. If both operands are numeric, use addition!
1. If either operand is a String, use concatenation!
1. Evaluate from left to right.

## Class String

## Class StringBuilder

### delete(int start, int end)

- End index is always excluded

## StringBuilder vs. StringBuffer

- Use StringBuilder in new code
- StringBuilder is faster
- StringBuffer is thread safe

## Equality of strings

- Only if Strings are equal at compile time, they share the same object in the string pool
- Never use == to compare objects
- Implementation of equals method can contain unexpected behaviour
  - StringBuilder.equals checks references for equality

## Arrays

- The dimension of an array is determined by the number of array dimensions on the variable name + the number of array dimensions on the type

## Class Arrays

### Arrays.equals()
- Tests only for reference equality

### Arrays.binarySearch()

Java provides a convenient way to search in arrays, but only if the array is already sorted.

Search is called binary search, because array is split in two halfs to determine in which half the searched element is located. This process is repeated until only the searched element remains. (This is also the reason why binary search works only on sorted arrays.)

<table>
  <tr>
    <th>Scenario</th>
    <th>Result</th>
  </tr>
  <tr>
    <td>Target element found in sorted array</td>
    <td>Index of match</td>
  </tr>
  <tr>
    <td>Target element not found in sorted array</td>
    <td>Negative value showing one smaller than the negative of index, where a match needs to be inserted to preserve sorted order</td>
  </tr>
  <tr>
    <td>Unsorted array</td>
    <td>A surprise - this result isn't predictable</td>
  </tr>
</table>

### Arrays.asList()

P.137 Converting Between Array and List

- Method creates a list object based on provided array
- Created list shares the data structure with the original array
- Therefore method creates a fixed sized list
  - Methods that change the size of the list throw an UnsupportedOperationException
  - I.e. add(), remove()
- This behaviour applies also to the varargs notation
  - Arrays.asList("one", "two", "three")

## Class Collections

## Creating Dates and Times

- The following classes are provided to create dates and times
  - LocalDate
  - LocalTime
  - LocalDateTime
- Instances of these classes are immutable
- These classes provide static factory methods to create objects
  - now()
  - of()
- No public constructors are provided
- Calling a private constructor results in a compilation error
  - Watch out for `new Local...()` on the exam

---

- The old way of creating and handling dates in Java was using the
  - __Date__ and
  - __Calender__ class
- Bear in mind that months were indexed starting with 0
- When using the __Local__\* classes and the __Month__ enumeration, months are indexed starting with 1

## Formatting Dates

- Class DateTimeFormatter is used to format LocalDate, LocalTime, and LocalDateTime
```Java
DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
DateTimeFormatter typeDependsOnPattern = DateTimeFormatter.ofPattern("yyyy MM dd");
```
- Local* classes and DateTimeFormatter provide a format method to create a String representation of a date
```Java
LocalDate date1 = LocalDate.now();
DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
formatter1.format(date1);
date1.format(formatter1);
```

## Primitve Types and Wrapper Classes

- For every primitive type Java provides a wrapper class
- The wrapper classes provide methods convert primitive types into objects and the other way around

### Autoboxing and Unboxing

Converting a primitive value (an int, for example) into an object of the corresponding wrapper class (Integer) is called autoboxing. The Java compiler applies autoboxing when a primitive value is:

- Passed as a parameter to a method that expects an object of the corresponding wrapper class.
- Assigned to a variable of the corresponding wrapper class.

The compiler is surrounding the used primitive variable with a call of a valueOf method. (For example _Integer.valueOf(primitiveIntValue)_)

Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing. The Java compiler applies unboxing when an object of a wrapper class is:

- Passed as a parameter to a method that expects a value of the corresponding primitive type.
- Assigned to a variable of the corresponding primitive type.

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
- Properties are private
- Getter methods begin with is if the property is a boolean
- Getter methods begin with get if the property is not a boolean
- Setter methods begin with set
- The method name must have a prefix of set/get/is followed by the property name written in camel case

## Lambdas
- The removeIf() method on ArrayList takes a Predicate

## Static Methods

Static methods can be called directly on the class. They can also be called on object references. Java uses the corresponding class object for the method call. This is the reason why you can even call static method on null references if they have the correct type.

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

## Abstract Class Definition Rules
1. Abstract classes cannot be instantiated directly.
1. Abstract classes may be defined with any number, including zero, of abstract and nonabstract methods.
1. Abstract classes may not be marked as private or final.
1. An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.
1. The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.

## Abstract Method Definition Rules
1. Abstract methods may only be defined in abstract classes.
1. Abstract methods may not be declared private or final.
1. Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
1. Implementing an abstract method in a subclass follows the same rules for overriding a method. For example, the name and signature must be the same, and the visibility of the method in the subclass must be at least as accessible as the method in the parent class.

## Interface Definition Rules
1. Interfaces cannot be instantiated directly.
1. An interface is not required to have any methods.
1. An interface may not be marked as final.
1. All top-level interfaces are assumed to have public or default access. Therefore, marking an interface as private, protected, or final will trigger a compiler error, since this is incompatible with these assumptions.
1. All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition. Therefore, marking a method as private, protected, or final will trigger compiler errors as these are incompatible with the abstract and public keywords.

## Default Method Definition Rules
1. A default method may only be declared within an interface and not within a class or abstract class.
1. A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
1. A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class that implements the interface.
1. Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected.

## Static Interface Method Rules
1. Like all methods in an interface, a static method is assumed to be public and will not compile if marked as private or protected.
1. To reference the static method, a reference to the name of the interface must be used.

## Exceptions
If both the _catch_ and the _finally_ block throw an exception, the one from the _finally_ block gets thrown.

When a method overrides a method in a superclass or interface, it is not allowed to add checked exceptions. It is allowed to declare fewer exceptions or declare a subclass of a declared exception. Methods declare exceptions with the keyword throws.

### Common Runtime Exceptions
All subclasses of java.lang.RuntimeException. I.e:

- ArithmeticException
- ArrayIndexOutOfBoundsException
- ClassCastException
- IllegalArgumentException
- NullPointerException
- NumberFormatException

## Common Checked Exceptions
Subclasses of java.lang.Exception, but not java.lang.RuntimeException. I.e:

- IOException
- FileNotFoundException

## Common Errors
Subclasses of java.lang.Error. I.e:

- ExceptionInInitializerError
- StackOverflowError
- NoClassDefFoundError

## Issues
__P. 237__ "The default package private modifi er, which is the lack of any access modifi er,
indicates the class can be accessed only by a subclass or class within the same package."

Looks like the class itself is only available in the same package. See code example _chapter5/class-access-modifiers_

__P. 262__ "When working with abstract classes, it is important to remember that by themselves, they cannot be instantiated and therefore do not do much other than define static variables and methods."

Abstract classes can also contain instance variables. See code example _chapter5/abstract-classes_. Interfaces on the other hand can only contain static and final attributes and methods.

__P. 263__ "The key point is that the first class to extend the ___nonabstract___ class must implement all inherited abstract methods."

This seems to be incorrect. It should rather say: "The key point is that the first ___nonabstract___ class to extend the ___abstract___ class must implement all inherited abstract methods."

__P. 267__ "All top-level interfaces are assumed to have public or default access, and they must include the abstract modifier in their definition."

Since the _abstract_ keyword is assumed by the compiler, it must not be included in the definition. See code example _chapter5/implementing-interfaces_.

__P. 282__ "The compiler will not allow casts to unrelated types."

This doesn't seem to work all the time. The compiler seems to be able to detect if two classes are unrelated. But if an interface is used as the type of an object, the compiler is unable to detect that a class and an interface are not related to each other. See code example _chapter5/casting-objects_.

__P. 313__ "This is why you often see another try/catch inside a finally block—to make sure it doesn’t mask the exception from the catch block."

How does this look like?

## Open Questions

#### An interface can extend multiple interfaces. In combination with default methods the diamond problem could arise. Is this really true?

If the diamond problem occurs the compiler will throw an error and the code will not compile. To circumvent the problem the class or interface can provide an own implementation of the method in question. This way the programmer clearly defined which implementation to use, and the diamond problem no longer exists. See code example _chapter5/diamond-problem_.

#### Are variables allowed to be abstract?

#### How to override default methods in interfaces? Is the default keyword needed a second time?

In an interface all methods that have a method body must use the keyword default. If a method of a parent interface has to be overridden, it has to be marked as a default implementation again.

#### The interface definition rules state: All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition. What about static interface methods?

#### (Apparently not important for OCA) What is a try-with-resources statement?

#### Do switch statements work with all strings?

## To Do
- Review questions chapter 1 to 4
- Insert hand written notes into README file
- Revisit failed questions

loparco-syntax
