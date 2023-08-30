import java.util.Scanner;
public class recursion9 {
    //GIVEN A NUMBER N, FIND SUM OF NATURAL NO. TILL N BUT WITH ALTERNATE SIGN
    public static int recursion(int n){
        if(n==0)return 0;
        if(n%2==0) {
            return recursion(n - 1)-n;
        }else{
            return recursion(n-1)+n;
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number =");
        int n= sc.nextInt();
        System.out.println(recursion(n));
    }
}
