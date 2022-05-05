public class AbstractWork {
    public static void main(String[] args) {

HarryPoter h1 = new HarryPoter();
h1.printBookName();
h1.printInfo();
    }
}

abstract class Book{
    public abstract void printBookName();
    void printInfo(){
        System.out.println("Print Info");
    }
}

class HarryPoter extends Book{
    public void printBookName(){
        System.out.println("Hello");
    }
}


