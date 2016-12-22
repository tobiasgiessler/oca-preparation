public interface Boat extends Vehicle {
  public default int getVMax() {
    return 5;
  }
}
