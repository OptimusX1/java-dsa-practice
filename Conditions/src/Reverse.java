public class Reverse {
    static void main() {
        int n = 1234567;
        int ans = 0,rem =0;

        while(n > 0){
            rem = n % 10;
            ans = ans * 10 + rem;
            n = n/10;
        }

        System.out.println(ans);
    }
}
