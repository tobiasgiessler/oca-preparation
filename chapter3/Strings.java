public class Strings {

    public static void main(String[] args) {
        final String myString = "animals";
        System.out.println(myString.substring(3)); // mals (start index is included)
        System.out.println(myString.substring(myString.indexOf('m'))); // mals
        System.out.println(myString.substring(3, 4)); // m (start index is included, end index isn't)
        System.out.println(myString.substring(3, 7)); // mals (7 is allowed since end index isn't inclued)

        System.out.println(myString.substring(3, 3)); // empty string
        //System.out.println(myString.substring(3, 2)); // thows exception
        //System.out.println(myString.substring(3, 8)); // throws exception
    }

}
