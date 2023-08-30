import java.util.Scanner;
public class recursion {
    // WOP TO PRINT ALL NATURAL NO. FROM 1 TO N USING RECURSION
    public static void  recursion(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        recursion(n-1);
        System.out.println(n);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter limit=  ");
        int n= sc.nextInt();
        recursion(n);
    }

}
