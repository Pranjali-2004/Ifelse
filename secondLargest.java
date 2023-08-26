public class secondLargest {
    public static void main(String[]args){
        // Program to find second largest number in given array

        int temp;
        int[]arr= {10,20,30};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest number= "+arr[arr.length -2]);
    }
}
