import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class FindAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear = sc.nextInt();

        LocalDate ld = LocalDate.now();
        int age =  ld.getYear() - birthYear;
        System.out.println("Your age is "+ age);
    }
}
