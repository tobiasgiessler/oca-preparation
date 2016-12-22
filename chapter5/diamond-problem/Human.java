public class Human implements Walk, Run {

  // code will not compile if an own implementation of getSpeed is missing
  public int getSpeed() {
    // create an implementation of Walk just to use the method
    Walk w = new Walk() {};
    return w.getSpeed();
  }

  public static void main(String[] args) {
    Human h = new Human();
    System.out.println("speed = " + h.getSpeed());
  }
}
