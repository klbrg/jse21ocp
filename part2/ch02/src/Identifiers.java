public class Identifiers {

    // Valid identifiers:
    int age = 34;
    String _name = "klbrg";
    double $salary = 50000.50; // Currency symbols are allowd
    boolean isValid = true;
    final int MAX_VALUE = 100;

    // Valid but discouraged identifiers
    boolean mål = true; // Not ASCII
    float sum_$ = 500f;

    // Invalid identifiers
    // int _ = 10; // Single underscore is not allowed, it's a reserved keyword
    // 123name = "One Two Three"; // Cannot start with a digit
    // String class = "Test"; // class is a keyword
    // double my-salary = 1000; // Hyphens not allowed
    // int void = 0; // void is a keyword
    // boolean public = true; // public is a keyword

    public static void main(String[] args) {
        // Key rules for Java identifiers
        System.out.println("Key Rules for Java Identifiers:");
        System.out.println("1. Must start with a letter (a–z, A–Z), underscore (_), or currency symbol ($,£).");
        System.out.println("2. Cannot start with a digit (e.g., 3abc is invalid).");
        System.out
                .println("3. Subsequent characters can include letters, digits (0–9), underscores, or currency signs.");
        System.out.println("4. Cannot be a Java keyword (e.g., class, public, void).");
        System.out.println("5. Identifiers are case-sensitive (e.g., 'Value' and 'value' are different).");
        System.out.println("6. No special characters allowed (e.g., -, @, space, etc.).");
    }

}
