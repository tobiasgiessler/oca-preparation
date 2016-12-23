interface MyInterface {}

class MyClass {}

public class Question10 {
  public static void main(String[] args) {
    System.out.println("MyClass: " + MyClass.class.getSuperclass().getName());
    // interfaces do not have a superclass they inherit from
    System.out.println("MyInterface: " + MyInterface.class.getSuperclass());
  }
}
