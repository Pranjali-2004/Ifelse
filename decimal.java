public class decimal {
    public static void main(String[]args){
        String b= " ";
        int n= 93;
        int t=n;
        while(t>0){
            int r=t%2;
            t=t/2;
            b=r+b;
        }
        System.out.println("the binary number will be= "+b);
    }
}
