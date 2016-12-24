public class Main {
  public static void main(String[] args) throws Exception {
    try {
      throw new RuntimeException("Exception thrown in try");
    } catch (RuntimeException e) {
      System.out.println("cought RuntimeException");
      throw new RuntimeException("Exception thrown in catch");
    } finally {
      System.out.println("finally block");
      throw new Exception("Exception thrown in finally");
    }
  }
}
