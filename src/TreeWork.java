public class TreeWork {
    public static void main(String[] args) {
        Tree t1 = new Tree("Apple",30.2, "brown");
        t1.printInfo();
        Tree t2 = new Tree("Orange", 15.0);
        t2.color= "green";
        t2.printInfo();
    }
}
class Tree{
    // Properties / Instance / Field
    String name;
    double height;
    String color;
    // Constructor
    public Tree(String name, double height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public Tree(String name, double height) {
        this.name = name;
        this.height = height;
    }

    void printInfo(){
        System.out.println("Name of tree is "+this.name);
        System.out.println("Height of tree is "+this.height);
        System.out.println("Color of tree is "+this.color);
        System.out.println("*************************");
    }
}
