import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATLAS : Hello! Sir, How can I assist you today?");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("hello")) {
                System.out.println("ATLAS : Hi there! ");
            } else if (userInput.equalsIgnoreCase("how are you")) {
                System.out.println("ATLAS : I'm good, thank you. How about you?");
//
            } else if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("ATLAS : Goodbye! Have a great day!");
                System.out.println("ATLAS : Great to see you ");
                // break;
                break;
            } else {
                System.out.println("ATLAS : Sorry, I didn't understand that.");
                System.out.println("Try Something different");
            }
        }
//        scanner.close();

    }
}
