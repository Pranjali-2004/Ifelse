public class subString {
    public static void main(String[]args){
        // print all substring of a string
        String a= "abc";
        for(int i=0; i<=2; i++){
            for(int j=i+1; j<=3; j++){
                System.out.println(a.substring(i,j)+" ");

            }
        }
    }
}
