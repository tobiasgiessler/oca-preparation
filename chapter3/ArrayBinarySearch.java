import java.util.Arrays;

public class ArrayBinarySearch {
  public static void main(String[] args) {
    final int[] numbers = {2,1,6,22,9,5};
    System.out.println("original array: " + Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println("sorted data: " + Arrays.toString(numbers));
    System.out.println("22 at index: " + Arrays.binarySearch(numbers, 22));
    System.out.println("3 at index: " + Arrays.binarySearch(numbers, 3));
  }
}
