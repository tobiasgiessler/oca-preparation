public class ForLoops {
  public static void main(String[] args) {
    for (int i = 1; checkVar(i); i = updateVar(i)) {
      System.out.println("execute for block (i = " + i + ")");
    }
  }

  public static boolean checkVar(int var) {
    System.out.println("execute condition statement");
    return var < 5;
  }

  public static int updateVar(int var) {
    System.out.println("execute update statement");
    return ++var;
  }
}
