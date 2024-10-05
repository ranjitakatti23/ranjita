import java.util.Scanner;

public class reverse {
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str1=Sc.nextLine();
        String reverse=" ";
        for(int i=str1.length()-1;i>=0;i--)
        {
            reverse+=str1.charAt(i);
        }
            System.out.println("reverse string="+reverse);
        }

        
    }

    

