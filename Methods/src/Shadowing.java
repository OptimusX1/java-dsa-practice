public class Shadowing {
    static int age = 24;
    static void main() {
        // how declaring and initializing int age possible ( it is already declared and initialiized right )
         int age = 25;
         sum();
        callingSum();

    }



    static void sum(){
        System.out.println(age);

    }

    static  void callingSum(){
        sum();
}


 //   sum();  //why this error "java: invalid method declaration; return type required"

}

