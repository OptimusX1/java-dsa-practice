import java.util.Arrays;

public class VarArgs {

    static void main() {
        //Varargs (Variable Arguments).
        sum(1,2,3);
        sum2("JAagn", "sai", "Abhi");
        sum3(10,20,"DSA", "Java", "Bootcamp");

    }

    //We are telling the compiler.I can provide zero or more than zero int arguments. That's what varargs are.
    static  void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // Java treats the variable `v` as a string array.
    static  void sum2(String ...v){
        System.out.println(Arrays.toString(v));
    }

    //Passing default arguments and variable arguments.
    static void sum3(int a, int b, String ...c){

        // String.join() combines all the elements of the varargs array.
        System.out.print(a + b + " " + String.join(" " ,c)) ;
    }
}
