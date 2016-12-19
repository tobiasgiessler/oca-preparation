public class StringBuilders {

    public static void main(String[] args) {
        // creates empty StringBuilder
        StringBuilder sb1 = new StringBuilder();
        // create StringBuilder with the characters "animal" in it
        StringBuilder sb2 = new StringBuilder("animal");
        // creates empty StringBuilder with capacity of 10 characters
        StringBuilder sb3 = new StringBuilder(10);
        // the default capacity of a StringBuilder object is 16

        // Testing equality
        StringBuilder sb4 = new StringBuilder("Hallo");
        StringBuilder sb5 = new StringBuilder("Hallo");
        System.out.println(sb4.equals(sb5));
        System.out.println(sb4.toString().equals(sb5.toString()));
    }

}
