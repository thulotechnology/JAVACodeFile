import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter P: ");
        double p = sc.nextDouble();
        System.out.println("Enter T: ");
        double t = sc.nextDouble();
        System.out.println("Enter R");
        double r = sc.nextDouble();

        // calculation
        double si = (p*t*r)/100;

        System.out.println("The simple interest is "+si);


    }
}
