//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    pattern1(5);
//    pattern2(5);
//      pattern3(5);
//      pattern4(5);
//    pattern5(5);
//    pattern6(5);
//    pattern7(5);
pattern8(5);
//    *
//   ***
//  *****
// *******
//*********

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




