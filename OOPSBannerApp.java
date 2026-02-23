public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Combine letters to form "OOPS"
        for (int i = 0; i < banner.length; i++) {
            banner[i] = String.join("   ", O[i], O[i], P[i], S[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method to build letter O
    public static String[] buildO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method to build letter P
    public static String[] buildP() {
        return new String[]{
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Static method to build letter S
    public static String[] buildS() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }
}