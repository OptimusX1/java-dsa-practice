
class Solution {
    public int largestDigit(int n) {
        if (n == 0) return 0;

        int modOfN = 0;
        int largest = 0;

        while (n != 0) {
            modOfN = n % 10;

            if (largest < modOfN) {
                largest = modOfN;
            }

            n = n / 10;
        }

        return largest;
    }
}

public class largestDigitChecking {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int n = 10;

        int result = solution.largestDigit(n);

        System.out.println("Largest digit: " + result);
    }
}
