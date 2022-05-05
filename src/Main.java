
class Mic{
    void printInfo(){
        System.out.println("Welcome to Default Mic Info");
    }
}

class Boya extends Mic{
    void printInfo(){
        super.printInfo();
        System.out.println("Welcome to Boya Mic Info");
    }
}
public class Main {
    public static void main(String[] args) {
        Mic m1 = new Mic();
        Boya b1 = new Boya();

        m1.printInfo();
       b1.printInfo();
    }
}