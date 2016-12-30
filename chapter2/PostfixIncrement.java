public class PostfixIncrement {
  public static void main(String[] args) {
    int i = 1;
    /*
    A statement like the following has no effect. Since the assignment operator is evaluated at last and die postfix
    increment operator doesn't show the updated value in THIS statement, the updated value of the increment operator is
    overridden by the assignment operator.
    */
    i = i++;
    System.out.println(i);
  }
}
