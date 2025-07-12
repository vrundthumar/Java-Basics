public class Arrays2D {

    public static void main(String[] args) {

        // 2D array = an array of arrays.
        
        // 1st method of 2d array
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150" ;
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (int i=0; i<cars.length; i++) {git
            System.out.println();
            for (int j=0; j<cars[i].length;j++) {
                System.out.println(cars[i][j]+"");
            }
        }


        // 2nd method of 2d array.
        // String[][] cars1 = {{"Camaro", "Corvette", "Silverado"},
        //                     { "Mustang","Ranger","F-150"},
        //                     {"Ferrari", "Lambo", "Tesla"}};

        //  for (int i=0; i<cars1.length; i++) {
        //     System.out.println();
        //     for (int j=0; j<cars1[i].length;j++) {
        //         System.out.println(cars1[i][j]+"");
        //     }
        // }  
        
    }   
        
}
        

