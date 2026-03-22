public class Hello_App {

    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Append all names with delimiter
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        if (nameBuilder.length() > 0) {
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);
            System.out.println("Hello, " + names + "!");
        }
    }
}