import java.util.Scanner;
public class array1 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array length= ");
        int a= sc.nextInt();
        int[]array= new int[a];
        System.out.println("enter array element= ");
        for(int i=0; i<a; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the array element are=");
        for(int i=0; i<a; i++){
            System.out.println(array[i]+" ");
        }

        }
    }

