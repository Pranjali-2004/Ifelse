public class repeating {
    public static int repeating(int[]arr, int n){
        // program to find first repeating element
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return i;
                }
            }
        }
        return -1;

    }
    public static void main(String[]args){
        int[]arr= {23,45,32,21,46,46};
        int n= arr.length;
        int index=repeating(arr,n);
        if(index==-1){
            System.out.println("no element is repeated");
        }else{
            System.out.println("the repeated element= "+arr[index]);
        }
    }
}
