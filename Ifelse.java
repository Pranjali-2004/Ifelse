import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //whether number is odd or even
        System.out.println("Enter number=");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            if (num % 2 != 0) {
                System.out.println("The number is odd");
            }
        }
    }
}