public class recursion3 {
    //FIND FIBONNACI NUMBER
    public static int recursion(int n){
        if(n==0 || n==1){
            return n;
        }
        int p= recursion(n-1);
        int pp= recursion(n-2);
        int ans= p+ pp;
        return ans;

    }
    public static void main(String[]args){
        System.out.println(recursion(6));
    }
}
