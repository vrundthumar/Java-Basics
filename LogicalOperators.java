public class LogicalOperators {

    public static void main(String[] args) {
 
        // LOGICAL Operators
        // && = (AND)
        // || = (OR)
        // !  = (NOT) 

        int temp = 15;

        if (temp > 30 && temp < 20) {
            System.out.println("It is warm outside");
        }
        else if (temp > 500 || temp < -500) {
            System.out.println("The thermometer is not working");
        }    
        else {
            System.out.println("It is cold outside");
        }
        



    }
    
}
