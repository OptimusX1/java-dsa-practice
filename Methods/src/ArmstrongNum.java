public class ArmstrongNum {
    static void main() {

        //Print arm strong num's from 100 to 999

        for (int n = 100; n < 1000; n++) {
            isArmstronng(n);
        }

    }

    static void isArmstronng(int n) {
        int rem = 0, sum = 0;
        int original = n;
        while (n > 0) {

            rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;

        }
        if (sum == original)
            System.out.print(sum + " ");
    }

}