import java.util.Scanner;
public class recursion10 {
    // GIVEN TWO NUMBER X AND Y . FIND GREATEST COMMON DIVISOR OF X AND Y USING RECURSION
    public static int recursion(int x, int y){
        while(x%y!=0){
            int rem= x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of x and y= ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(recursion(x,y));
    }


}
