public class recursion12 {
    // PRINT MAX VALUE FROM GIVEN ARRAY
    public static int recursion(int[]arr, int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int s= recursion(arr, index+1);
        return Math.max(arr[index],s);

    }
    public static void main(String[]args){
        int[]arr= {2,3,4,5};
        System.out.println(recursion(arr,0));
    }
}
