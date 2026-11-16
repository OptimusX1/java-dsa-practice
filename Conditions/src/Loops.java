import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    static void main() {
        Scanner in = new Scanner(System.in);

        //printing num from 1 to 5
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }
//
        // printing nums from 1 to n
//        int number = in.nextInt();
//        int i = 1;
//        while(i <= number){
//            System.out.println(i);
//            i++;
//        }
//

        //print at least one num
        int number = in.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i <= number);
    }
}
