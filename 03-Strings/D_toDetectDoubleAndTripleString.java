
public class D_toDetectDoubleAndTripleString {

    public static void main(String[] args) {
        String myString = "This string contains  double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

    }
}
