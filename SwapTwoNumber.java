public class SwapTwoNumber {
    public static void main(String[] args){

        String x = "Pepsi";
        String y = "Coca-Cola";
        String temp;

        System.out.println("Before Swapping :");
        System.out.println("x :"+x);
        System.out.println("y :"+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping :");
        System.out.println("x :"+x);
        System.out.println("y :"+y);
    }
}


