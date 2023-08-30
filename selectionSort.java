public class selectionSort {
    //SORTING THE ARRAY
    static void select(int[]arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int min =i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[min];
            arr[min]= temp;

        }
    }
    public static void main(String[]args){
        int[]arr= {5,6,7,1,2,0,8,9};
        select(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
