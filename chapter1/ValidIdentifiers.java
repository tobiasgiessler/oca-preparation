public class ValidIdentifiers {
  public static void main(String[] args) {
    // identifers can contain letters, numbers, $, or _
    int name;
    int name1;
    int name1$;
    int name1$_;

    // identifers can start with letters, $, or _
    int $name1$_;
    int _name1$_;

    // german Umlaute are just letters (so identifers can also start with it)
    int nämeäöüß = 5;
    int ßname;

    // identifers must not start with a numbers
    // int 1stName; // DOES NOT COMPILE

    // other symbols are not allowed
    // int n§me; // DOES NOT COMPILE
  }
}
