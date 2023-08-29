import java.util.ArrayList;
import java.util.Collections;
public class sortFromArrayList {
    static void desc(ArrayList<Integer>List){
        ArrayList<Integer>list= new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("original array= "+list);
        Collections.sort(list);
        System.out.println("ascending order= "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order= "+list);


    }

}
