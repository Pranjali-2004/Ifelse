public class swapByAddSubtract {
    public static void main(String[]args){
        int x= 5;
        int y=9;
        System.out.println("no. before swaping= "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping= "+x+" "+y);
    }
}
