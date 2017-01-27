class Vehicle {}
class Car extends Vehicle {}
class TotallyDifferentClass {}

public class InheritanceAndCasts {

  public static void main(String[] args) {
    final Vehicle bike = new Vehicle();
    final Car car = new Car();

    // COMPILES AND RUNS - no cast needed
    final Vehicle carAsVehicle = car;

    // DOES COMPILE, BUT DOES NOT RUN - needs explicit cast to compile
    final Car bikeCar = (Car) bike;

    // DOES NOT COMPILE
    // final TotallyDifferentClass senselessObject = (TotallyDifferentClass) bike;
  }

}
