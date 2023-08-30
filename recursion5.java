public class recursion5 {
    // RETURN COUNT OF DIGIT IN GIVEN NUMBER
    public static int recursion(int n){
        int count=0;
        while(n!= 0){
            n= n/10;
            count++;
        }
        return count;
    }
    public static void main(String[]args){
        int n= 34566578;
        System.out.println(recursion(n));
    }
}
