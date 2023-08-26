public class maxNumber {
    public static void main(String[]args){
        //finding maximum no. from given array
        int[]arr={32,13,34,56};
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans= arr[i];
            }
        }
        System.out.println("The max no. in array is= "+ans);
    }
}
