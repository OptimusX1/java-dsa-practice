public class OverLoading {
    static void main() {
        //At compile time, the compiler decides which function to invoke based on the provided arguments.
        // The argument types must differ, or the arguments themselves must be different.
        sum(1);
        sum("Jagan");
    }

    static  void sum(int a){
        System.out.println(1 + a);
    }

    static  void sum(String a){
        System.out.println("Ganireddy" + a);
    }
}
