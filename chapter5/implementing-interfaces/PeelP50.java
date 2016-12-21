public class PeelP50 implements Vehicle {

  public int getMaxVelocity() {
    return 40;
  }

  public static void main(String[] args) {
    Vehicle p50 = new PeelP50();
    System.out.println("Vmax = " + p50.getMaxVelocity());
    System.out.println("Age (instance) = " + p50.AGE);
    System.out.println("Age (static) = " + PeelP50.AGE);
    // p50.NUMBER_OF_WHEELS = 3; // DOES NOT COMPILE
    System.out.println("NUMBER_OF_WHEELS (instance) = " + p50.NUMBER_OF_WHEELS);
    System.out.println("NUMBER_OF_WHEELS (static) = " + PeelP50.NUMBER_OF_WHEELS);
  }

}
