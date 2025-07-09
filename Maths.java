public class Maths {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -5;
        double z = 9;

        double maximum = Math.max(x, y);     //To find maximum number.
        double minimum = Math.min(x, y);     //To find minimum number.
        double absolute = Math.abs(y);       //To find absolute value witch is number without negative sign. 
        double squareroot = Math.sqrt(z);    //To find square root of any number.
        double roundof = Math.round(x);      //To round of any number.
        double ceil = Math.ceil(x);
        double floor = Math.floor(x);


        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(absolute);
        System.out.println(squareroot);
        System.out.println(roundof);
        System.out.println(ceil);
        System.out.println(floor);

    }
    
}


