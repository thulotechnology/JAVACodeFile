import java.util.Scanner;
public class ExceptionWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            int birthYear = 2022 - age;
            System.out.println("Your birth year is "+birthYear);
        }
        catch(Exception e) {
            System.out.println("Enter only number");
        }

    }
}

//  Multiply 3 numbers from user input using exception handling.
