import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class palindrome {public static void main(String[] args) 
        {
            Scanner Sc=new Scanner(System.in);
            System.out.println("enter the value of r");
            int r=Sc.nextInt();
            System.out.println("enter the value of sum");
            int sum=Sc.nextInt();
            int n;
            int temp=r;
            while(r!=0)
            {
            n=r%10;
            sum=(sum*10)+n;
            r=r/10;
            }
           if(temp==r)
              {
                 System.out.println("it is a palindrome");
              }
           else
             {
               System.out.println("it is not a palindrome");
             }

    
            
        }
    }

    
    

    
    

