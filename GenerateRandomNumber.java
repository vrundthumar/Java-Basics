import java.util.Random;

public class GenerateRandomNumber {

    public static void main(String[] args) {

        // How to generate random number.
        
        Random ramdom = new Random();

        int num = ramdom.nextInt(6)+1;    //Now it will generate random number  between 1 and 6.

        System.out.println(num);
    }
}


