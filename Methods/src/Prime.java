import java.util.Scanner;

public class Prime {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter a number : ");
        int number = in.nextInt();

       boolean bool =  isPrime(number);
        System.out.println(bool);
    }

    static boolean isPrime(int n){

        //my way of writing prime
        if (n <= 1) return  false;

        int c = 2;
        boolean bool = true;
        while(c * c <= n){
            if (n % c == 0){
                bool = false;
                break;
            }
            c++;

        }
        return  bool;
    }

    static  boolean isPrimeKunal(int n){
        int c = 2;
        while(c * c <= n){
            if (n % c == 0){
                return  false;
            }
            c++;
        }
        return  c * c > n;
    }
}
