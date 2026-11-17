import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0, b = 1;

        while (a <= n) {

            System.out.println(a);

            int fibo = a + b;

            a = b;
            b = fibo;
        }
    }
}