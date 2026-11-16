//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    String a = new String("Java");
//    String b = new String("Java");
//
//    System.out.println(a == b);
//    System.out.println(a.equals(b));


    // printing about fruits
    Scanner in  = new Scanner(System.in);
//    String fruit = in.next();
//
//    switch (fruit) {
//        case "apple" -> System.out.println("It is a sweet red fruit");
//        case "mango" -> System.out.println("it is a yellow color fruit");
//        case "Guava" -> System.out.println("It is rich in fiber");
//        default -> System.out.println("Enter a valid fruit name");
//    }


    //printing weekends or week days

    int  day = in.nextInt();
    switch(day){
        case 1,2, 3, 4 -> System.out.println( "Weeday");
        case 5,6 ,7 -> System.out.println("Weekend");

    }

}
