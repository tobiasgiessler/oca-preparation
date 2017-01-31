class NumericPromotion {
  public static void main(String[] args) {
    // all types smaller than int are promoted to an int value when used
    // with an binary arithmetic operator
    byte b = 3;
    short s = 4;
    char c1 = 'a';
    char c2 = 'b';

    System.out.println(c1 + c2);
    System.out.println(++c1);

    int i = 8;
    long l = 9l;

  }
}
