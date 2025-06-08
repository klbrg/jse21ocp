public class Complements {
    static int mask = 248;

    public static void main(String[] args) {
        String regex = "(.{4})(?!$)"; // Group by 4s
        System.out.printf("%40s (%4d)%n", Integer.toBinaryString(mask).replaceAll(regex, "$1 "), mask);
        System.out.printf("%40s (%d) One's complement%n", Integer.toBinaryString(~mask).replaceAll(regex, "$1 "),
                ~mask);
        System.out.printf("%40s (%d) Two's complement%n", Integer.toBinaryString(~mask + 1).replaceAll(regex, "$1 "),
                ~mask + 1);

    }
}