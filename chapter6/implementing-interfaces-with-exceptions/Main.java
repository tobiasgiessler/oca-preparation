class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}

interface Roar {
  void roar() throws HasSoreThroatException;
}

class Lion implements Roar {
  // public void roar() {}
  // public void roar() throws HasSoreThroatException {}
  // public void roar() throws IllegalArgumentException {}
  public void roar() throws TiredException {}
}

public class Main {
  public static void main(String[] args) {
    try {
      Roar jack = new Lion();
      jack.roar();
    } catch (HasSoreThroatException e) {
      e.printStackTrace();
    }
  }
}
