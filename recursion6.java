public class recursion6 {
    //GIVEN TWO NUMBER P AND Q, FIND P^Q USING RECURSION
    public static int recursion(int p, int q){
        if(q==0) return 1;
        int an= recursion(p,q-1);
        int ans= an*p;
        return ans;

    }
    public static void main(String[]args){
        System.out.println(recursion(3,2));
    }
}
