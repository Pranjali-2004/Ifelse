public class recursion4 {
    //GIVEN INTEGER, FIND OUT SUM OF ITS DIGIT USING RECURSION
    public static int recursion(int n){
        if (n>=0 && n<= 9){
            return n;

        }
        int p= recursion(n/10);
        int ans= p+ n%10;
        return ans;
    }
    public static void main(String[]args){
        System.out.println(recursion(1234));
    }
}
