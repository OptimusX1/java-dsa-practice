import java.util.Scanner;

public class Question25 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("ENter as many as num's you can : ");

        int negSum = 0, evenNums = 0, oddNums = 0;

        while(true){
            int n = in.nextInt();

            if ( n == 0)
                break;
            else if (n % 2 == 0) {

                evenNums += n;
            }
            else if ( n > 0) {
                oddNums += n;
            }
            else
                negSum += n;
        }


        System.out.println("negSum :" + negSum);
        System.out.println("evenNums : " + evenNums);
        System.out.println("oddNums : " + oddNums);
    }
}
