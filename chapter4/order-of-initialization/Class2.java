public class Class2 {

  private static final String staticField1 = "a";
  static { System.out.println("Class2 staticField1: " + staticField1); }

  private final String instanceField1 = "b";
  { System.out.println("Class2 instanceField1: " + instanceField1); }

}
