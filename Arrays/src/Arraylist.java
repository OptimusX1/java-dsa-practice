import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    static void main() {
        //add(), set(), contains()., get()

        //declaring Array list
        ArrayList<Integer> list = new ArrayList<>(4);

        //inputing data
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);

        //printing or accessing arraylist
        for (int i = 0 ; i < 5; i++){
            //you can't access list[index]
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println(list.contains(0));


        //updating Array list
        list.set(3,6);
        System.out.println(list);

    }
}
