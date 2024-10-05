import java.util.Scanner;
  public class posorneg 
{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=Sc.nextInt();
        if(num>=0)
            System.out.println("positive number");
        else
            System.out.println("negative number");
    
    }
}       


