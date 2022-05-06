import java.util.LinkedList;

public class LinkedListWork {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Ram Thapa");
        names.add("Susmita Khadka");
        names.addFirst("Mina Gurung");

        String allNames = "";

    for(String n: names){
       allNames = allNames + n + "\n";
    }
        System.out.println(allNames);

    }
}
// Calculate Total Sum of 5 Numbers using linked list.