public class Arrays {

    public static void main(String[] args) {
        // declaring arrays
        int[] animals1;
        int [] animals2;
        int animals3[];
        int animals4 [];

        // declaring two arrays at once
        int[] ids, types;

        // declaring one int array and an int
        int ids2[], types2;

        // creating arrays
        int[] numbers1 = new int[3]; // all elements have the default value 0
        int[] numbers2 = new int[] {42, 55, 99};
        int[] numbers2_2 = {42, 55, 99};

        // creating arrays with reference variables
        String[] bugs = { "cricket", "beetle", "ladybug" };
        String[] bugs2 = { "cricket", "beetle", "ladybug" };
        // Array.equals tests only for reference equality
        System.out.println(bugs.equals(bugs2));

        // casting arrays
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        //objects[0] = new StringBuilder(); // throws error at run time

        // using an array
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;

        // providing an array as param
        testMethod1(new int[1]);
        testMethod1(new int[] {1,2});
        testMethod1(new int[] {1}, 2);
        testMethod1(new int[] {1}, 2, 3, 4);
        testMethod1(new int[] {1}, new int[] {2, 3, 4});
    }

    public static void testMethod1(int[] param1) {};
    public static void testMethod1(int[] param1, int... param2) {};

}
