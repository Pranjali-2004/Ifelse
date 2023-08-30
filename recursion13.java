public class recursion13 {
    // PROGRAM TO FIND SUM OF ARRAY USING RECURSION
    static int recursion(int[]arr, int index){
        if(index== arr.length){
            return 0;
        }
        int s= recursion(arr,index+1);
        return s+arr[index];

    }
    public static void main(String[]args){
        int[]arr= {1,2,3,4};
        System.out.println(recursion(arr,0));
    }


}
