//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//
//      pattern1(5);
//    System.out.println();
//      pattern2(5);
//    System.out.println();
//      pattern3(5);
//    System.out.println();
//      pattern4(5);
//    System.out.println();
//      pattern5(5);
//    System.out.println();
//      pattern6(5);
//    System.out.println();
//      pattern7(5);
//    System.out.println();
//      pattern8(5);
//    System.out.println();
//    StriverPattern7(5);
//    System.out.println();
//    StriverPattern8(5);
//    System.out.println();
//pattern11(2);
//pattern11Optimised(5);
// pattern12(5);
    pattern13(5);
}

private void pattern13(int n) {
    for (int row = 1; row <= n ; row++) {
        String value = "A";
        for (int col = 1; col <= row ; col++) {
            System.out.print(value);

        }
        System.out.println();
    }
}

void pattern12(int n ){
    int value = 1;
//    System.out.println("value outside for loop: " + value);
    for (int row = 1; row <= n; row++) {

//        System.out.println(value);
        for (int col = 1; col <= row ; col++) {

            System.out.print(value + " ");
            value++;

        }
//        value += 1;
        System.out.println();
    }
//    System.out.println("Value outside for loop " + value);
}

private void pattern11Optimised(int n) {
    for(int row = 1; row <= n; row++){
        int value = (row % 2 == 0)  ? 0 : 1;

        for(int col = 1; col <= row; col++){
            System.out.print(value + " ");
            if (col < row) System.out.print(" ");

            value = 1 - value;

        }System.out.println();
    }
}

private void pattern11(int n) {
    for(int row = 1; row <= n; row++){

        String rowType = (row % 2 == 0) ? "even" : "odd";

        for(int col = 1; col <= row; col++){
            if(rowType.equals("even")){
                if (col % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            else if (col % 2 == 0) System.out.print("0 ");
            else System.out.print("1 ");

        }System.out.println();
    }
}

private void StriverPattern8(int n) {
    for(int row = 5; row >= 1; row--){
        int spaces = n - row;
        for (int space = 1; space <= spaces; space++) {
            System.out.print(" ");
        }
        for(int col = 1; col <=  ( 2*row) - 1; col++){

            System.out.print("*");

        }System.out.println();
    }
}

private void StriverPattern7(int n) {
    for(int row = 1; row <= n; row++){
        int spaces = n - row;
        for (int space = 1; space <= spaces; space++) {
            System.out.print(" ");
        }
        for(int col = 1; col <=  ( 2*row) - 1; col++){

            System.out.print("*");

        }System.out.println();
    }
}

private void pattern8(int n) {
    for(int row = 1; row <= n; row++){

        for(int col = 1; col <=  ( 2*row) - 1; col++){

            System.out.print("* ");

        }System.out.println();
    }
}

private void pattern7(int n) {
    for(int row = 1; row <= n; row++){
        for(int col = 1; col <= (n-row)+1; col++){

            System.out.print(col + " ");

        }System.out.println();
    }
}

private void pattern6(int n) {
    for(int row = 1; row <= n; row++){
        for(int col = 1; col <= (n-row)+1; col++){

            System.out.print(col + " ");

        }System.out.println();
    }
}

private void pattern5(int n) {
    for(int row = 1; row <= n; row++){
        for(int col = row; col <= n; col++){

            System.out.print("* " + " ");

        }System.out.println();
    }
}

private void pattern4(int n) {
    for(int row = 1; row <= n; row++){
        for(int col = 1; col <= row; col++){

            System.out.print(row + " ");

        }System.out.println();
    }
}

private void pattern3(int n) {
    for(int row = 1; row <= n; row++){
        for(int col = 1; col <= row; col++){

            System.out.print(col + " ");

        }System.out.println();
    }
}

private void pattern2(int n) {
    for(int row = 0; row < n; row++){
        for(int col = 0; col <= row; col++){

            System.out.print("* ");

        }System.out.println();
    }
}

private void pattern1(int n) {
    for(int i = 0; i<n; i++){
        for(int c = 0; c < n; c++){

            System.out.print("*");

        }System.out.println();
    }
}




