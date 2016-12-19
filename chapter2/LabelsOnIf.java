public class LabelsOnIf {

  public static void main(String[] args) {
    boolean switchOne = true;
    boolean switchTwo = true;

    FIRST_LEVEL_IF: if (switchOne) {
      while (switchOne) {
        System.out.println("switchOne true");
        switchOne = false;
        //break FIRST_LEVEL_IF;
        // continue FIRST_LEVEL_IF; // only possible for loop labels
      }
      System.out.println("DID NOT BREAK OUT!");
    }
    else {
      while (switchTwo) {
        System.out.println("switchTwo true");
        switchTwo = false;
      }
    }
  }

}
