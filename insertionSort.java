public class insertionSort {
    static void sort(int[]a){
        int n=a.length;
        for(int i=1; i<n; i++){
            int j=i  ;
            while(j>0 && a[j]< a[j-1]){
                int temp= a[j];
                a[j]= a[j-1];
                a[j-1]= temp;
                i--;
            }
        }


        }
    public static void main(String[]args){
        int[]a= {5,3,4,1};
        sort(a);
        for(int val:a){
            System.out.println(val+" ");
        }
    }

}
