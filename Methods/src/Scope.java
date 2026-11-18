public class Scope {
    int x = 10;
    static void main() {
//        int a = 10;
//        String name  = "Jagan";
//        {
//            a = 20;
//            name = "Kumar";
//            String name2 = "Sai";
//        }
//        System.out.println(a);
//        System.out.println(name);
//
//        String name2 = "sai"; //Anything that can be initialized inside scope can be initialized
        // outside the scope , but u can't use the var initialized inside the block


        //Scopes in Looping
        for(int i =0; i < 5; i++){
            int loop1 = 10;
        }
//        System.out.println(loop1); you can't use var declared ina loop


        int x;
//        System.out.println(x);  //scoping begins when the var is declared
        x  = 10;

    }
}
