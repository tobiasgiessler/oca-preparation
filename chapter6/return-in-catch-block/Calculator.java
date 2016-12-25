public class Calculator {
  public int div(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      System.out.println("I will return 0 in the next line");
      return 0;
    } finally {
      System.out.println("An error occured!");
    }
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    final int result = calc.div(4,0);
    System.out.println(result);
  }
}
