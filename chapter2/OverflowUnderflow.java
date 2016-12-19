public class OverflowUnderflow {

    public static void main(String[] args) {
        // What is the largest short value
        //System.out.println((short)(Math.pow(2, 16) / 2 - 1));
        System.out.println((short)(Short.MAX_VALUE + 1));

        short y = (short)1921222; // Stored as 20678
        System.out.println(y);

        /*
          32755
          32756
          32757
          32758
          32759
          32760
          32761
          32762
          32763
          32764
          32765
          32766
          32767
          -32768
          -32767
          -32766
          -32765
          -32764
          -32763
          -32762
          -32761
          -32760
          -32759
          -32758

          ...

          -10
          -9
          -8
          -7
          -6
          -5
          -4
          -3
          -2
          -1
          0
          1
          2
          3
          4
          5
          6
          7
         */
    }

}
