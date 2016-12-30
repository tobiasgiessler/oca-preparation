class Base {}
class SubClass extends Base {}

public class EqualsOperator {
  public static void main(String[] args) {
    // boolean result = "Hallo" == new StringBuilder("Hallo"); // DOES NOT COMPILE: INCOPATIBLE TYPES
    System.out.println(new Base() == new SubClass());
    System.out.println(5 == new Integer(5));
    System.out.println(new Integer(5) == 5);
    short s = 5;
    System.out.println(s == new Integer(5));
    System.out.println(new Integer(5) == s);
    System.out.println(5 == 5.0);
    // System.out.println(new Integer(5) == new Double(5.0)); // DOES NOT COMPILE: INCOPATIBLE TYPES
  }
}
