public class binary {
    public static void main(String[]args){
        // convert binary number into decimal numbers
        int n= 1011;
        int t= n;
        int i=0; int d=0;
        while(t>0){
            int r= t%10;
            t=t/10;
            d=d+r*(int)Math.pow(2,i++);
        }
        System.out.println("THE DECIMAL NUMBER IS="+d);

    }
}
