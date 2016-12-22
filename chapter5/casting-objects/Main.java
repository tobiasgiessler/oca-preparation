import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    // Object arrayList = new ArrayList<String>(); // compiles successfully
    // List<String> arrayList = new ArrayList<String>(); // compiles successfully
    ArrayList<String> arrayList = new ArrayList<String>(); // compilation error: incompatible types
    Calendar c = (Calendar)arrayList;
  }
}
