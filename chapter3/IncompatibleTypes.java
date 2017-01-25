public class IncompatibleTypes {
  public static void main(String[] args) {
    // upcasts are done automatically
    long l = 5;
    // autoboxing and toString() if an operator like '+' is used
    String s1 = 5 + "";
    String s2 = new Integer(5).toString();
    // if assignment operator is used, the types must be compatible
    // String s3 = 5; // DOES NOT COMPILE
    // Even though every object provides a toString() method, an assignment is only successful if the types
    // are compatible
    // String i = new Integer(3); // DOES NOT COMPILE
  }
}
