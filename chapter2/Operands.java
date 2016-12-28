public class Operands {

  public static void main(String[] args) {
    // upcasts are done automatically
    float x = 2;

    /*
    Smaller integral types than int are promoted to int when binary
    arithmetic operator is used. Result is than also an int.
    */
    short y = 1;
    short z = 2;
    short result = (short)(y + z);

    /*
    Luckily integral types larger than int are not demoted.
    */
    long l1 = 1L;
    long l2 = 2L;
    long longResult = l1 + l2;


    /*
    Float types are not promoted to the "standard" floating point type double,
    when a binary arithmetic operator is used.
    */
    float f1 = 1.2f;
    float f2 = 2.1f;
    float floatResult = f1 * f2;
  }

}
