import java.util.HashMap;
import java.util.Map;


public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // Add patterns to the map
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        // Word to render
        String word = "OOPS";

        // Render banner using Map lookup
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}