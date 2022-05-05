public class HousePropertes {
    public static void main(String[]args) {
        House h1=new House();
        h1.id= 1;
        h1.name="Villa";
        h1.price=500000;
        h1.printAll();

        House h2=new House();
        h2.id= 2;
        h2.name="Bungalow";
        h2.price=800000;
        h2.printAll();

        House h3=new House();
        h3.id= 3;
        h3.name="Cottage";
        h3.price=1000000;
        h3.printAll();
    }
}
class House{
    int id;
    String name;
    int price;

    // Method
    void printAll(){
        System.out.println("Id is "+this.id);
        System.out.println("Name is "+ this.name);
        System.out.println("Price is "+this.price);
    }

}