//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //    pattern1(5);
//    pattern2(5);
//    pattern3(5);
//    patternfKunal(5);
//    pattern4(6);
//    pattern5(5);
      pattern28(5);

// 28      *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *

    }

void pattern28(int n){
    for (int row = 1; row < 2*n; row++) {
        int numOfCols = ( row > n ) ?  (2*n - row )  :  row;
        int numOfSpaces = n - numOfCols;
        for (int space = 1; space <= numOfSpaces ; space++) {
            System.out.print(" ");
        }
        for (int col = 1; col <= numOfCols ; col++) {
            System.out.print("* ");
        }
        System.out.println();

    }
}
void pattern5(int n){
    for (int row = 1; row < 2*n; row++) {

        int numOfCols = ( row > n ) ?  (2*n - row )  :  row;
        for (int col = 1; col <= numOfCols ; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

void pattern4(int n) {
    for (int row  = 1 ; row <= n; row++){
        for(int col = 1; col <= row; col++){
            System.out.print(col + " ");
        }
        System.out.println();
    }
    System.out.println();
}

void pattern3(int n) {
    for (int row  = 5 ; row > 0; row--){
        for(int col = 1; col <= row; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

void patternfKunal(int n) {
    for (int row  = 1 ; row <= n; row++){
        for(int col = 1; col <= n-row+1; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

void pattern1(int n) {

    for (int row  = 1 ; row < n; row++){
        for(int col = 1; col <= n; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

void pattern2(int n) {

    for(int row = 1; row <= n; row ++){
        for(int col = 1; col <= row; col++ ){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();

}

