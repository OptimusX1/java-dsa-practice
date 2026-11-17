public class Scope {
    static void main() {
        int a = 10;
        String name  = "Jagan";
        {
            a = 20;
            name = "Kumar";
            String name2 = "Sai";
        }
        System.out.println(a);
        System.out.println(name);

        String name2 = "sai"; //Anything that can be initialized inside scope can be initialized
        // outside the scope , but u can't use the var initialized inside the block


    }
}
