import java.util.LinkedList;

public class LinkedListQuestion {
    public static void main(String[] args) {
        LinkedList<Double> expenses = new LinkedList<Double>();

        expenses.add(100.0);
        expenses.add(200.0);
        expenses.add(300.0);
        expenses.add(400.0);
        expenses.add(500.0);

        double total = 0;
        for(Double exp: expenses){
           total = total + exp;
        }

        System.out.println("Total is "+total);
    }
}
// Calculate Total Number of Places Using LinkedList