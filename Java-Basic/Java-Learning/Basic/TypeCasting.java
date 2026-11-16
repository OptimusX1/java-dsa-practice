import java.util.Scanner;

public class TypeCasting {
    private static String system;

    static void main() {

//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        System.out.println("number enetereed : " + number);


        // Type casting
//        int num1 = (int) (123.123);
//        System.out.println(num1);

        int  num2 = 257;
        byte num3 = (byte) (num2); //255 % 256 = -1   --? how
        System.out.println(num3);

        byte b = 2;
        char c = 'C';
        short s = 1022;
        int  i = 5;
        double d = 0.3456789;
        float f = 3.2f;

        System.out.println(( f*b) + " + " + (i / c) + " - " +(d * s ));
        double result = ( f*b) + (i / c) - (d * s );
        System.out.println(result);




    }
}
