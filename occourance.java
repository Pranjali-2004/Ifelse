import java.util.Scanner;
public class occourance {
    public static void main(String[]args){
        // program to check given number occurance
        Scanner sc= new Scanner(System.in);
        System.out.println("enter total no. of element=");
        int n= sc.nextInt();
        int[]arr= new int[n];
        System.out.println("enter array element= ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter element whose frequency u want to know= ");
        int e= sc.nextInt();
        int occ= 0;
        for(int i=0; i<n; i++){
            if(e==arr[i]){
                occ++;
            }
        }
        System.out.println("occurance of number in array is ="+occ);

    }

}
