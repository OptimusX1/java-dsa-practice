import java.util.Scanner;


public class Largest {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();;
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(Math.max(c, Math.max(a,b)));

    }
}
