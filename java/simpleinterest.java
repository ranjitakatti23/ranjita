
import java.util.Scanner;

public class simpleinterest{
        public static void main(String[] args) 
        {
            Scanner Sc=new Scanner(System.in);
            System.out.println("enter the value of amount");
            int P=Sc.nextInt();
            System.out.println("enter the time");
            int T=Sc.nextInt();
            System.out.println("enter teh rate of interest");
            int R=Sc.nextInt();
            int S;
            S=(P*T*R)/100;
            System.out.println("simple interest="+S);
        }
}
    
    

    
        
    
    

