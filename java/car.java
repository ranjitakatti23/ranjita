 class car {
    private String modelName;
    private String owner;
    private int regNumber;
    public car(String modelName,String owner,int regNumber)
    {
        this.modelName=modelName;
        this.owner=owner;
        this.regNumber=regNumber;
    }  
    public void startEngine()
    {
        System.out.println("car can be started..");
    }
    public void accelarate()
    {
        System.out.println("car can be accelarate..");

    }
    public void stop()
    {
        System.out.println("car can be stopped..");
    }
    public void showcarinformation(){
        System.out.println("the car is owned by"+owner);
        System.out.println("the car is owned by"+modelName);
        System.out.println("the car is owned by"+regNumber);
    }
    public static void main(String[] var0) {
        car mycar=new car("suzuki", "xyz",1234);
        mycar.startEngine();
        mycar.accelarate();
        mycar.stop();
        mycar.showcarinformation();
         }

    }

