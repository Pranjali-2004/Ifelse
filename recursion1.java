import java.util.Scanner;
public class recursion1 {
    //WAP TO PRINT ALL NATURAL NO FROM N TO 1 USING RECURSION
    public static void recursion(int n){
        if(n==1){
            System.out.println(n);
            return;

        }
        System.out.println(n);
        recursion(n-1);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter limit= ");
        int n= sc.nextInt();
        recursion(n);
    }
}
