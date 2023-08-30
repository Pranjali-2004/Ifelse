import java.util.Scanner;
public class recursion7 {
    //GIVEN A NUMBER AND VALUE K, PRINT K MULTIPLE OF NUMBER
    public static void recursion(int n, int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        recursion(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of n and k= ");
        int n= sc.nextInt();
        int k= sc.nextInt();
        recursion(n,k);

    }


}
