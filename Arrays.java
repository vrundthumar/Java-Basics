public class Arrays {

    public static void main(String[] args) {

        // Arrays = used to store multiple values in a singlr variable of same data type.

        String[] cars = {"BMW", "Bugati", "Pagani", "Tesla"};

        cars[3] = "Mercedese";

        // System.out.println(cars[1]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        
        // ANOTHER WAY 
        // ANOTHER WAY 
        // ANOTHER WAY 

        String[] city = new String[3];

        city[0] = "Monaco";
        city[1] = "Swizzerland";
        city[2] = "Rajkot";

        System.out.println(city[1]);
    }
    
}
