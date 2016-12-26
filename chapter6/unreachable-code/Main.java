import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println("work real hard");
    } catch (IOException e) {
    } catch (RuntimeException e) {
    }
  }
}
