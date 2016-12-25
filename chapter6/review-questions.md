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
