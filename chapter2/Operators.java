public class Operators {
  public static void main(String[] args) {
    // modulo (remainder operator)
    System.out.println("7 % 4 = " + 7 % 4);

    // unary + and -
    int positiveInt = +5; // would be a positive int without the + anyway
    int negativeInt = -positiveInt;
    int positiveAgain = -negativeInt;

    // postfix (increments value but evaluates to original value)
    int i = 0;
    if (i++ == 0)
      System.out.println("i is now " + i);

    // instanceof
    final String name = "Vincent";
    final String name2 = null;
    System.out.println("String is an instance of object: " + (name instanceof Object));
    System.out.println("null reference is an instance of object: " + (name2 instanceof Object));

    // bit operators
    final int one = 0b0001;
    final int two = 0b0010;
    final int four = 0b0100;
    final int eight = 0b1000;
    final int fifteen = 0b1111;

    System.out.println(one | eight); // inclusive bitwise or
    System.out.println(one ^ fifteen); // exclusive bitwise or
    System.out.println(two & fifteen); // bitwise and
    System.out.println(Integer.toBinaryString(four) + " = " + four); // unary bitwise complement operator
    System.out.println(Integer.toBinaryString(~four) + " = " + ~four); // unary bitwise complement operator
    System.out.println(one << 1); // shifts bits of 'one', 1 bits to the left (zeros are filled on the right)
    System.out.println(two >> 1); // shifts bits of 'two', 1 bits to the right (zeros are filled on the left)
    System.out.println(two >> 1);// shifts bits of 'two', 1 bits to the right
  }
}
