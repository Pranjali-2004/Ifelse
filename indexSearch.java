public class indexSearch {
    public static void main(String[]args){
        //Program to find index of given array value
        int[]arr={32,3,12,33,65};
        int a= 12;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==a){
                System.out.println("element is present at" + i + "index");
            }
        }
    }
}
