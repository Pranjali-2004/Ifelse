public class firstOccBinary {
    static int firstOcc(int[]a, int x){
        int n= a.length;
        int st=0; int end = n-1;
        int occurance= -1;
        while(st<=end){
            int mid= (st+end)/2;
            if(a[mid]==x){
                occurance= mid;
                end=mid-1;
            }else if(x< a[mid]){
                end= mid-1;
            }else{
                st= mid+1;
            }
        }
        return occurance;
    }
    public static void main(String[]args){
        int[]a= {1,2,2,4,5,5};
        int x=5;
        System.out.println(firstOcc(a,x));
    }
}
