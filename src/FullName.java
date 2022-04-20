import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName + " "+ lastName;
        System.out.println("Your fullname is "+fullName);
    }
}

// Write a Program in Java To Print User Full Name.

