public class uc5_hello{
    public static  void main(String args[]){
       StringBuilder namesBuilder = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            namesBuilder.append("World");
        } else {
            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }
        }

        // Print the greeting
        System.out.println("Hello, " + namesBuilder + "!");
    }
}