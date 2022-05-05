import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        for(int i =0; i<5; i++){
            System.out.println("Enter name :");
            String name = sc.nextLine();
            names.add(name);
        }

        for(String name: names){
            System.out.println(name);
        }


    }
}

//
//        names.add("Aashriti Malla");
//                names.add("Amit Chhetri");
//                names.add("Anjana Lamichhne");
//                names.add("Bibhushan KC");
//                names.add("Bivor Swar");
//                names.add("Eak Guring");
//                names.add("Pooja Pant");
//                names.add("Rikesh Gandharba");
//                names.add("Sanjog Shiwakoti");
