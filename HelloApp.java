public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Combine all names with comma
            String allNames = String.join(", ", args);

            // Replace last comma with 'and' for proper grammar
            int lastComma = allNames.lastIndexOf(", ");
            if (lastComma != -1) {
                allNames = allNames.substring(0, lastComma) 
                         + " and " 
                         + allNames.substring(lastComma + 2);
            }

            System.out.println("Hello, " + allNames + "!");
        }
    }
}