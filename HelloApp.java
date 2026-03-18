public class HelloApp {
    public static void main(String[] args) {

        
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            
            String allNames = String.join(", ", args);

            
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