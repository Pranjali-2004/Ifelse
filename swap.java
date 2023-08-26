import java.util.Scanner;
public class swap {
    public static void main(String[]args){
        //Swaping two numbers
        Scanner sc= new Scanner(System.in);
        int x,y,t;
        System.out.println("enter values of x and y= ");
        x= sc.nextInt();
        y= sc.nextInt();
        System.out.println("no. before swaping= "+x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println("no, after swaping= "+x+" "+y);
        System.out.println();
    }
}
