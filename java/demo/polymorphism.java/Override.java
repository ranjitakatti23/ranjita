class bird 
{
    public void sound()
    {
        System.out.println("bird make sound");
    }

}
class parrot extends bird
{
    public void sound()
    {
        System.out.println("the parrot can fly");

    }
}
class crow extends bird
{
    public void sound()
    {
        System.out.println("the crow can fly");
    }
}
public class Override
{
    public static void main(String[] args)
     {
        bird mybird =new bird();
        bird myparrot=new parrot();
        bird mycrow=new crow();

        mybird.sound();
        myparrot.sound();
        mycrow.sound();

    }
}
    