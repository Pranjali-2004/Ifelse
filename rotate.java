public class rotate {
    //Program to rotate the matrix 90 degree
    public static void right(int[][]matrix, int n){
        // First transpose the matrix then swap
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp= matrix[i][j];
                matrix[j][i]=temp;
            }
        }
        //Reverse element
        for(int i=0; i<n; i++){
            int low= 0;
            int high= n-1;
            while(low<high){
                int temp= matrix[i][low];
                matrix[i][low]= matrix[i][high];
                matrix[i][high]= temp;
                low++;
                high--;
            }
        }
        System.out.println("right rotated matrix= ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
                    }
    }
    public static void main(String[]args){
        int n=3;
        int[][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("the original matrix= ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        right(matrix,n);
    }
}
