public class AnimalWork4 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.run();
    }

}

abstract class Animals{
    public abstract void run();
}

class Elephant extends Animals{
    public void run(){
        System.out.println("Elephant is running");
    }
}

class Tiger extends  Animals{
    public void run(){
        System.out.println("Tiger is running");
    }
}