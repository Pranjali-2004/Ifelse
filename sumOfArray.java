public class sumOfArray {
    public static void main(String[]args){
        //sum of given array
        int[]arr={23,34,21,32};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
        }
        System.out.println("the sum of arr= "+sum);
    }
}
