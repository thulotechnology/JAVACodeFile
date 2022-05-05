public class InterfaceWork {
}

interface Vehicle{
    void run();
}

interface Vechicle2{
    void fly();
}

class Bike implements Vehicle, Vechicle2{
    public void run(){
        System.out.println("Bike is running.");
    }

    public void fly(){
        System.out.println("A");
    }
}
