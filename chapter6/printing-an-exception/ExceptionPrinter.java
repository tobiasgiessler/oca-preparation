public class ExceptionPrinter {
  public static void main(String[] args) {
    try {
      hop();
    } catch (RuntimeException e) {
      System.out.println(e);
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
  private static void hop() {
    throw new RuntimeException("cannot hop");
  }
}
