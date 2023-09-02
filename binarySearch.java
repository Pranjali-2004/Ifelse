public class binarySearch {
    //SEARCHING ELEMENT IN GIVEN ARRAY
    static boolean binary(int[]a, int target){
        int n= a.length;
        int st= 0,  end= n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(target== a[mid]){
                return true;
            }else if (target <a[mid]){
                end= mid-1;

            }else{
                st= mid+1;
            }

        }
        return false;


    }
    public static void main(String[]args){
        int[]a={1,2,3,4,5};
        int target= 4;
        System.out.println(binary(a,target));
    }
}
