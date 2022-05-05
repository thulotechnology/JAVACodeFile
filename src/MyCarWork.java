public class MyCarWork {
    public static void main(String[] args) {
        Tesla h1 = new Tesla();
        h1.start();
    }
}

class Car{
String name;
int noOfSeat;

void start(){
    System.out.println("Car is starting...");
}
}

class Tesla extends Car{
    void start(){
        System.out.println("Tesla Car is starting...");
    }
}

class Honda extends Car{

}

class BMW extends Car{
    void start(){
        System.out.println("BMW Car is starting...");
    }
}
