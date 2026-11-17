import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingExample {
    static void main() {
//        int a = 10;
//        change(a);
//        System.out.println(a);

        int[] array1 = {1,2,3};
        changeArray(array1);
        System.out.println(Arrays.toString(array1));
    }


    static void change(int a) {
        a = 20;
        System.out.println("Change method : " + a);
    }

    static void changeArray(int[] array1) {
        array1[0] = 100;

    }

}
