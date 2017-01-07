import java.util.List;
import java.util.ArrayList;

public class TestClass {
  public static void main(String[] args) {
    List<Integer> ages = new ArrayList<>();
    ages.add(Integer.parseInt("5"));
    ages.add(Integer.valueOf("6"));
    ages.add(7);
    ages.add(null);
    for (int age : ages) System.out.print(age);
  }
}
