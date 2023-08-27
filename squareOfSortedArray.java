import java.util.Arrays;
public class squareOfSortedArray {
    //Program to return array of square of each no. sorted int non-decraesing order
    public static void sortSquares(int[]arr){
        int n= arr.length;
        //first convert array into square
        for(int i=0; i<n; i++){
            arr[i]=arr[i]*arr[i];
            //sort array using inbulit sort function
            Arrays.sort(arr);
        }
    }
    // driven code
    public static void main(String[]args){
        int[]arr= {-4,4,2,3,5,6};
        int n= arr.length;
        System.out.println("before sort= ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
            sortSquares(arr);
            System.out.println(" ");

            }
            System.out.println("After sort= ");
            for(int i=0; i<n; i++){
                System.out.println(arr[i]+" ");

        }
    }
}
