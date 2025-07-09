import java.util.Scanner;;

public class IfElseStatment {
    
    public static void main(String[] args) {

        // If statment = performs a block of code if it's condition is evaluates to be true.

        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");
        age = scanner.nextInt();

        if (age > 18 && age < 60727) {
            System.out.println("You are adult!");
        }
        else if (age > 60) {
            System.out.println("You are at the age of retirement!");
        } 
        else {
            System.out.println("You are young!");
        }
    }
}


