public class recursion2 {
    //FIND FACTORIAL OF NUMBER BY RECURSION
     static int recursion(int n){
        if(n==0) return 1;
        int small= recursion(n-1);
        int ans= n*small;
        return ans;
    }
    public static void main(String[]args){
        System.out.println(recursion(4));
    }
}
