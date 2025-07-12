public class String {
    
    public static void main(String[] args) {

        //String = a reference data type that can store one or more characters reference data types have access to useful methods

        String name = "Bro";
        
        boolean result1 = name. equals IgnoreCase ("bro");
        int result2 = name. length();
        char result3 = name. charAt(0);
        int result4 = name. indexof("o");
        boolean result5 = name. isEmpty();
        String result6 = name. toUpperCase();
        String result7 = name. toLowerCase();
        String result8 = name.trim();
        String result9 = name. replace('o', 'a');

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
    }
}
