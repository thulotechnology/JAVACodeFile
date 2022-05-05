import java.util.ArrayList;
import java.util.Scanner;

public class AddressWork {
    public static void main(String[] args) {
        ArrayList<String> address = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        // Add 7 Item Using For Loop
        for(int i=0; i<7; i++){
            System.out.println("Enter address at index "+i + ": ");
            String ad = sc.nextLine();
            address.add(ad);
        }

        System.out.println("All address in array list are: ");
        // For Printing All Address
        for(String a:address ){
            System.out.println(a);
        }
    }
}
