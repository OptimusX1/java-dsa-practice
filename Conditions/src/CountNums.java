public class CountNums {
    static void main() {
        int  n = 45432343;
        int count = 0, rem = 0;
        while ( n > 0 ){
            rem = n%10;
            if(rem == 3)
                count ++;
            n = n/10;
        }
        System.out.println("count : " + count);

    }
}
