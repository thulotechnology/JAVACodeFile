import java.util.Locale;

public class StringWork {
    public static void main(String[] args) {
        String address = "USA";

        //System.out.println(address.length());

        String firstName = "Gurung";
        String lastName = "gurung";

        //System.out.println(firstName.equals(lastName));

        String text = "I am from Pokhara. Pokhara is beautiful place";
        text = text.replace("Pokhara","USA");

        System.out.println(text.toLowerCase());

    }
}
