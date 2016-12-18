public class Class1 {

  private static final String staticField1 = "a";
  static { System.out.println("Class1 staticField1: " + staticField1); }

  private final String instanceField1 = "b";
  { System.out.println("Class1 instanceField1: " + instanceField1); }

}
