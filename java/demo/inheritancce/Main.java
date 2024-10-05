 class bird
  {
    void fly()
    {
        System.out.println("bird can fly");
    }
  }
 class parrot extends bird
    {
        void color()
        {
            System.out.println("iam green");
        }

    }
  class singleparrot extends parot
    {
        void sing()
        {
            System.out.println("i can sing");
        }
    }
  class cow extends bird 
  {
    void whatcoloriam()
    {
        System.err.println("i am white");
    }
  }
 public class Main
{
    public static void main(String[] args)
    {
        parrot p=new parrot();
        singleparrot sp=new singleparrot();
        cow S=new cow();
        p.fly();
        p.color();
        sp.sing();
    }
}
//why java do not support multiple inheritance
class A{
    void testMethod(){

    }
class B{
    void Method(){

    }
    class C extends A,B
}
}