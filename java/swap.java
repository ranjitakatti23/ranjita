import java.util.Scanner;

public class swap {
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=Sc.nextInt();
        System.out.println("enter the value of b");
        int b=Sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

    

    
   