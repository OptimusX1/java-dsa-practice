import java.util.Scanner;

public class Calculator {

    static void main() {
        // take operator
        // take operands
        // restart the process again untill user types 'x' or "X"
        Scanner in  = new Scanner(System.in);
        int cal = 0;

        while(true){
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);

            if (op == '*'  || op == '+' || op == '-'  || op == '%'){
                System.out.println("Enter the 1st Number : ");
                int num1 = in.nextInt();
                System.out.println("Enter the 2nd Number : ");
                int num2 = in.nextInt();

                if (op == '*')
                    cal = num1 * num2;
                else if (op == '+') {
                    cal = num1 + num2;
                } else if (op == '-') {
                    cal = num1 - num2;
                }
                else
                    cal = num1 % num2;
                System.out.println("Result : " + cal);

            }
            else if (op == 'x'  || op == 'X') {
                System.out.println("Ending Calculator.... ");
                break;

            }
            else{
                System.out.println("Invaid operator, give a valid operator ");
            }

        }


    }

}
