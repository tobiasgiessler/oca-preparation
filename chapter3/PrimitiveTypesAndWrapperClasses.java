public class PrimitiveTypesAndWrapperClasses {
  public static void main(String[] args) {
    // parsing numbers from strings
    int i1 = Integer.parseInt("1");
    float f1 = Float.parseFloat("1.0");
    double d1 = Double.parseDouble("1.0");
    //char c1 = Character.parseChar("a"); // DOES NOT COMPILE (no parse method in Character class)
    boolean b1 = Boolean.parseBoolean("true");

    Integer i2 = Integer.valueOf("1");
    Float f2 = Float.valueOf("1.0");
    Double d2 = Double.valueOf("1.0");
    Character c2 = Character.valueOf('a'); // careful method needs a char not a String
    Boolean b2 = Boolean.valueOf("true");

    Integer i3 = new Integer("1");
    Float f3 = new Float("1.0");
    Double d3 = new Double("1.0");
    Character c3 = new Character('a'); // careful method needs a char not a String
    Boolean b3 = new Boolean("true");

    // wrapping primitive values into objects
    Integer i4 = new Integer(1);
    Float f4 = new Float(1.0f);
    Double d4 = new Double(1.0);
    Character c4 = new Character('a');
    Boolean b4 = new Boolean(true);

    Integer i5 = Integer.valueOf(1);
    Float f5 = Float.valueOf(1.0f);
    Double d5 = Double.valueOf(1.0);
    Character c5 = Character.valueOf('a');
    Boolean b5 = Boolean.valueOf(true);

    // getting primitive values out of instances of wrapper classes
    int i6 = new Integer(1).intValue();
    float f6 = new Float(1.0f).floatValue();
    double d6 = new Double(1.0).doubleValue();
    char c6 = new Character('a').charValue();
    boolean b6 = new Boolean(true).booleanValue();

    // wrapping primitive values into objects using autoboxing
    // (all primitive values are surrounded by a *.valueOf() method call)
    Integer i7 = 1;
    Float f7 = 1.0f;
    Double d7 = 1.0;
    Character c7 = 'a';
    Boolean b7 = true;

    // getting primitive values out of instances of wrapper classes using unboxing
    int i8 = new Integer(1);
    float f8 = new Float(1.0f);
    double d8 = new Double(1.0);
    char c8 = new Character('a');
    boolean b8 = new Boolean(true);

    // All classes that extend java.lang.Number possess the methods intValue, floatValue, ...
    // BUT autoboxing and unboxing is only done for compatible types automatically
    short short1 = 1;
    int i9 = new Short(short1);
    int i10 = new Double(1.0).intValue(); // no automatic unboxing
    double d9 = new Integer(1);
  }
}
