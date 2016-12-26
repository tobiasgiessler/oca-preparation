# Chapter 6 Review Questions

__Q1__: B => You can handle java.lang.Error subclasses, but it's not a good idea.  
Q2: B,D  
Q3: C  
Q4: B  
__Q5__: A,B,D => java.io.IOException is thrown by many methods in the java.io package, but it is always thrown programmatically. The same is true for NumberFormatException; it is thrown programmatically by the wrapper classes of java.lang.  
Q6: C  
Q7: C  
__Q8__: E => The order of catch blocks is important. Since ArithmeticException is a child of RuntimeException, the second catch block is unreachable code. This causes the compiler error.  
Q9: B  
Q10: E  
Q11: A  
Q12: A,B,D,G  
Q13: A,B,C,E  
__Q14__: A,C,D,E => Runtime exceptions can be thrown in any method, no matter what is declared in the _throws_ clause. Learn which exceptions are runtime exceptions!  
Q15: A,B,D,E  
Q16: B  
__Q17__: A,C,D,E => The overridden method is just not allowed to throw more general or different checked exceptions. Additional unchecked exceptions or no exceptions at all are allowed.  
Q18: A,B,C,E  
__Q19__: C,E => The Java compiler checks if a checked exception from a catch block can be thrown in the try block. If no function, called in the try block, declares the corresponding checked exception to be thrown, the compilers realises that the catch block represent unreachable code.  
Q20: A,E
