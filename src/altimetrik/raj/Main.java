package altimetrik.raj;

class Car{
    boolean engine=true;
    int wheels=4;
    int cylinders=2;

    public Car(boolean engine, int wheels, int cylinders) {
        this.engine = engine;
        this.wheels = wheels;
        this.cylinders = cylinders;
    }

    public void startEngine(){
        if (engine){
            System.out.println("Engine Starting...");
        }
    }
    public void accelerte(){
        if (engine==true){
            System.out.println("Start Accelerating Car");
        }
    }
    public void brake(){
        System.out.println("Apply Brake");
    }
}


class  Bmw extends Car{

    public Bmw(boolean engine, int wheels, int cylinders) {
        super(engine, wheels, cylinders);
    }
    public void startEngine(){
        if (engine){
            System.out.println("Bmw 's Engine Starting...");
        }
    }
    public void accelerte(){
        if (engine==true){
            System.out.println("Bmw is Start Accelerating Car");
        }
    }
    public void brake(){
        System.out.println("Bmw Apply Brake");
    }


}


class  Audi extends Car{

    public Audi(boolean engine, int wheels, int cylinders) {
        super(engine, wheels, cylinders);
    }
    public void startEngine(){
        if (engine){
            System.out.println("Audi 's Engine Starting...");
        }
    }
    public void accelerte(){
        if (engine==true){
            System.out.println("Audi is Start Accelerating Car");
        }
    }
    public void brake(){
        System.out.println("Audi Apply Brake");
    }


}












public class Main {

    public static void main(String[] args) {
        for(int i=1;i<2;i++){
            switch (i){
                case 1:Bmw b=new Bmw(true,4,5);
                    b.startEngine();
                    b.accelerte();
                    b.brake();
                case 2:
                    Audi a=new Audi(true,5,3);
                    a.accelerte();
                    a.startEngine();
                    a.brake();


            }
        }
    }
}
