public class Switch {

  public static void main(String[] args) {
    int dayOfWeek = 0;
    //long dayOfWeek = 0L;
    switch (dayOfWeek) {
      case 0:
        System.out.println("Sunday");
      default:
        System.out.println("Weekday");
      case 6:
        System.out.println("Saturday");
        break;
    }
    /*
     * dayOfWeek = 5
     * Weekday
     * Saturday
     *
     * dayOfWeek = 0
     * Sunday
     * Weekday
     * Saturday
     */

    /*
    String word = "two";
    //final String noConst = "four";

    switch (word) {
      case "one":
        System.out.println("one");
      case "two":
        System.out.println("two");
      case "three":
        System.out.println("three");
      case noConst:
        System.out.println("four");
      default:
        System.out.println("default");
      case "five":
        System.out.println("five");
      case "six":
        System.out.println("six");
    }
    */
  }

}
