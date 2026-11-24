import java.sql.SQLOutput;
import java.util.ArrayList;

public class MultiAlt {
    //declaring , inintializing and printinig
    //swap the nmum's bu indexes
    // MIN value and Max value
    //Reverse array

//    System.out.print("He");


    static void main() {
        ArrayList<Integer> list1  = new ArrayList<>();

        //declared Array list which is of type (Array List - Integer)
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(); //Initializing means

        for(int i = 0; i < 2; i++){
           list2.add(new ArrayList<>());
        }

        list2.get(0).add(10);
        list2.get(1).add(20);

        System.out.println(list2);

    }



}
