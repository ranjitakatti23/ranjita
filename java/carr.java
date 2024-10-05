public class carr {
    String brand;
    int year;
    public carr(String brand,int year)
    {
        this.brand=brand;
        this.year=year;
    }
    public void Displaycarrinfo()
    {
        System.out.println("carr brand:"+brand);
        System.out.println("manufacturer:"+year);

    }
    public static void main(String[] args) {
        carr mycarr=new carr("BMW",1995);
        mycarr.Displaycarrinfo();
    }
    
}
