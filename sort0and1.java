import java.util.Arrays;
public class sort0and1 {
    //Sort array consisting of 0 and 1
    public static void sortArray(int[] arr, int n) {
        int count = 0;
        System.out.println("array before sort= " + Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr[i]=1;
        }
        System.out.println("array after sort= "+Arrays.toString(arr));
    }
    public static void main(String[]args){
        int[]arr={1,0,1,0,0,1};
        int n= arr.length;
        sortArray(arr,n);
        System.out.println(arr+" ");
    }
}

