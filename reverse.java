public class reverse {
    public static void main(String[]args){
        //Reversing the given array
        int[]arr= {21,34,32,56,78};
        System.out.println("original array= ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the reverse array= ");
        for(int i= arr.length-1; i>=0; i--){
            System.out.println(arr[i]+" ");
        }
    }
}
