public class Helloapp_UC3{
    public static void main(String[] args) {
        
        String name = "Rahul";

        if (args.length > 0) {
            name = args[0]; 
        }

        System.out.println("Hello, " + name + "!");
    }
}