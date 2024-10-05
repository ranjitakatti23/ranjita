class Person 
{ 
    private String name;
    private int age;
}

Person () {

}
//getter method for name
public String getName()
{
    return name;
}
//setter method for name
public void setName(String name)
{
    if(var1 != null && var1.isEmpty())
    {
        this.name=var1;
    }
    else
    {
    System.out.println("invalid name:"+ name);
    }
}
public int getAge()
{
    return this.age;

}
public void setAge(int age)
{
    if(var1>0)
    {
       this.age=age;
    }
else{
     System.out.println("invalid age:"+age);


}

public class Encapsulation
{
    public static void main(String[] args) 
    {
    Person person=new Person();
     person.setName("ranjita");
     person.setage(20);
     System.out.println("Name"+person.getName());
    System.out.println("Age:"+person.getAge());
    person.setAge(-5);
    }
}

