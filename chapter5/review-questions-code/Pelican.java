abstract class Bird {
  private void fly() { System.out.println("Bird is flying"); }
  public static void main(String[] args) {
    Bird bird = new Pelican();
    bird.fly();
    // new Pelican().fly();
  }
}
public class Pelican extends Bird {
  protected void fly() { System.out.println("Pelican is flying"); }
}
