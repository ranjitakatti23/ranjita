public class exception {
    public static void main(String[] args) {
        try {
            //risky code that may handle cause an exception 
            int a=10/0;
            System.out.println("result:"+a);
        } catch (ArithmeticException e) {
            //handle the exception
            System.out.println("error division by zero");
        }
        finally{
            //cpde that always excetues
            System.out.println("this is fianlly block");
        }
        System.out.println("rest of the code..!");
    }
    
}

