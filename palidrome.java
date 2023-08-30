import java.util.Scanner;
public class palidrome {
    // PROGRAM TO CHECK WHEATHER GIVEN STRING IS PALIDROME
    static String reverse(String a, int index){
        if(index==a.length()) return " ";
        String b= reverse(a,index+1);
        return b+a. charAt(index);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string value= ");
        String a= sc. nextLine();
        String rev= reverse(a,0);
        if(rev.equals(a)){
            System.out.println("  palidrome");
        }else{
            System.out.println(" not palidrome");
        }

    }
}
