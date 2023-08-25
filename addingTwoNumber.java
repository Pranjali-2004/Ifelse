import java.util.Scanner;
public class addingTwoNumber {
    public static void main(String[]args){
        // taking two no. for addition
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first no.= ");
        int a= sc.nextInt();
        System.out.println("enter Second no.= ");
        int b= sc.nextInt();
        // adding two no.
        int sum=  a+ b;
        //Print sum
        System.out.println("The sum of two no. is ="+sum);

    }


}

