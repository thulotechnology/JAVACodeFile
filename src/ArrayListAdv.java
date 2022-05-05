import java.util.ArrayList;

public class ArrayListAdv {
    public static void main(String[] args) {
        ArrayList<Cycle> cycles = new ArrayList<Cycle>();

        cycles.add(new Cycle(1, "red", false));
        cycles.add(new Cycle(2, "black", true));
        cycles.add(new Cycle(3, "orange", true));
        cycles.add(new Cycle(4, "white", false));

        for(Cycle c : cycles){
            c.print();
        }

    }
}

class Cycle{
    int id;
    String color;
    boolean hasGear;

    // Constructor
    Cycle(int id, String color, boolean hasGear){
        this.id = id;
        this.color = color;
        this.hasGear = hasGear;
    }

    void print(){
        System.out.println("Cycle id is "+this.id);
        System.out.println("Cycle color is "+this.color);
        if(this.hasGear){
            System.out.println("Cycle has gear.");
        }else{
            System.out.println("Cycle doesn't has gear.");
        }

    }
}
