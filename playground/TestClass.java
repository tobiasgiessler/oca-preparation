public final class TestClass {
  public static void main(String[] args) {
    final IVehicle opelAstra = new Car();
    opelAstra.accelerate(50);
    IVehicle.reduceSpeed(10);
  }

  private abstract class Bla {}
}

interface IVehicle {
  int VELOCITY = 0; // static and final attributes must be initialized in order to compile

  void emergencyBreak(); // method is pulic and abstract by default

  default void accelerate(final int velocity) {
    System.out.println("Whooo!!! Now I'm going " + velocity + " km/h!");
  }

  static void reduceSpeed(final int velocity) {
		System.out.println("Breaking down to " + velocity + " km/h!");
	}
}

class Car implements IVehicle {
  public void emergencyBreak() {} // must be explicitly declared as public
}

abstract class SportsCar extends Car {}

/*
- Attributes in interfaces are automatically static and final and therefore must be initialized
- Methods in interfaces are automatically public and abstract and must be declared explicitly as
  public in implementing classes
- Interfaces cannot be made final (Making classes final is useful for immutable classes. This way the programmer can ensure that only immutable instances of this type exist. Since a mutable state cannot be described in an interface, this scenrio does not apply. By only allowing static and final attributes in an interface, the programmer can only describe immutable things in an interface.)
- In interfaces methods are not allowed to be final. This is also true for default and static methods.
*/

/*
?
- static methods in interfaces
- final abstract classes
*/
