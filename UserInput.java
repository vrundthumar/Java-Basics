import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // How to take input from user.

        // How to make a scanner function
        // ⭐ Syntax : Scanner Name_of_scanner = new scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scanner.nextLine();

        System.out.println("How old are you ? ");
        String age = scanner.nextLine();


        System.out.println("Hello !!" +name+ " You are" +age+ "'s old");

    }
}


