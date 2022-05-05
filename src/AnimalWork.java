public class AnimalWork {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name= "ABC";
        d.loyal = true;
        System.out.println("Dog name is "+d.name);
        System.out.println("Dog loyal status is "+d.loyal);


    }
}

class Animal{
    String name;
    String type;
    String color;

}

class Dog extends Animal{
   boolean loyal;
}
