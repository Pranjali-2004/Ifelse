import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class sumFromCoordinates {
    public static int sum(int[][]matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        for(int i=l1; i<=r1; i++){
            for(int j= l2; j<=r2; j++){
                sum +=  matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of rows and colunm= ");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][]matrix= new int[r][c];
        int total= r*c;
        System.out.println("enter"+total+" value= ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter boundary l1, l2, l3, l4= ");
        int l1= sc.nextInt();
        int l2= sc.nextInt();
        int r1= sc.nextInt();
        int r2= sc.nextInt();
        System.out.println("rectangle sum= "+sum(matrix,l1,l2,r1,r2));

    }
}
