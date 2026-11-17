Scanner in = new Scanner(System.in);

void main() {

    //Syntax :
 /*
 return_type function_name(){
   //body
 */
//    sum1();

//calling f(n) that has int return type
//    System.out.println(sum2());

//    greeting1();

//    System.out.print("Enter your Name : ");
//    String name = in.next();
//    greeting2(name);

    //Passing arguments
   int total =  sum3(22,33);
   System.out.println("Total : " + total);
}



void sum1() {
    System.out.print("Enter the number 1 : ");
    int num1 = in.nextInt();
    System.out.print("Enter the number 2 : ");
    int num2 = in.nextInt();

    System.out.println("Sum : " + (num1 + num2));
}

int sum2() {
    System.out.print("Enter the number 1 : ");
    int num1 = in.nextInt();
    System.out.print("Enter the number 2 : ");
    int num2 = in.nextInt();

    return (num1 + num2);
}

void greeting1(){
    System.out.println("Hello Bro");
}

void greeting2(String name) {
    System.out.println("Hello, I'm " + name);

}



int sum3(int a , int b){
    return a + b;
}

