import rope.*; // this import is neccessary, since the class Rope itself is imported by the next import
import static rope.Rope.*;

public class Chimp {

  public static void main(String[] args) {
    Rope.swing();
    new Rope().swing();
    System.out.println(LENGTH);
  }

}
