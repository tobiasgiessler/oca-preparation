public class Hamster {

  private String color;
  private int weight;

  public Hamster(int weight) {
    // this.weight = weight;
    // color = "brown";
    this(weight, "brown"); // call to this must be first statement in constructor
  }

  public Hamster(int weight, String color) {
    this.weight = weight;
    this.color = color;
  }

}
