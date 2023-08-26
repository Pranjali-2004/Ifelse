public class pairedSum {
    public static void pair(int[]arr, int x){
        //Program to find all pair of element in array whose sum is equal to x

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+ "+" +arr[j]+"=" +x);

                }
            }
        }


    }
    public static void main(String[]args){
        int[]arr={23,43,2,3,4,5,6,7,0,1};
        int x= 6;
        pair(arr,x);

    }

}
