import java.util.Scanner;

public class Temperature {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Celsisu Num : ");
        float celsius = in.nextFloat();
        float fahrenheit = ( celsius * 9/5 ) + 32;
        System.out.println("Fahreinheit of celsius " + celsius + " : " + fahrenheit);
    }
}
