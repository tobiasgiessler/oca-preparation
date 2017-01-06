public class CompoundOperator {
  public static void main(String[] args) {
    long l = 1L;
    int i = 1;
    // i = i + l; // DOES NOT COMPILE (no automatic cast due to possible lossy conversion)
    i += l; // DOES COMPILE (compound operator does even lossy conversions)
  }
}
