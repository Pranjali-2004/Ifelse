 import java.util.Scanner;
 import java.util.jar.JarOutputStream;

 class addNumberUsingOops {
     int ans=0;
     addNumberUsingOops(int a, int b){
         ans= a+b;

    }

}
 class Main{
    public static void main(String[]args){
        int x,y;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number= ");
         x= sc.nextInt();
        System.out.println("enter second number=");
         y= sc.nextInt();
        addNumberUsingOops c= new addNumberUsingOops(x,y);


        System.out.println("SUM OF NUMBERS IS ="+c.ans);

    }

}

