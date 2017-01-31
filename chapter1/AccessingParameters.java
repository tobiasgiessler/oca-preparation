public class AccessingParameters {
  public static void main(String[] args) {
    for (String arg : args) {
      System.out.println(arg);
    }
    //System.out.println(args[8]); // java.lang.ArrayIndexOutOfBoundsException if param wasn't provided
  }
}
