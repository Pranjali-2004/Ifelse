public class recuraion11 {
    // print array value using recursion
    public static void recursion(int[]arr, int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        recursion(arr,index+1);
    }
    public static void main(String[]args){
        int[]arr= {2,3,4,5};
        recursion(arr,0);
    }
}
