import java.util.ArrayList;
public class reverseArrayListMethod {
    static void reverse(ArrayList<Integer>list){
        int i=0; int j=list.size()-1;
        while(i<j){
            Integer temp= Integer.valueOf(list.get(i));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[]args){
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println("original array= "+list);
        reverse(list);
        System.out.println("reverse array= "+list);

    }


}
