public class Tiger extends Animal {
  public static void main(String[] args) {
    Tiger t = new Tiger();
    System.out.println("The tigers name is: " + t.getName());
    System.out.println("The tigers name is: " + t.name);
    // System.out.println("The tigers name is: " + Tiger.name); // DOES NOT COMPILE
  }
}
