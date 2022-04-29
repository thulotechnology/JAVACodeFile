import java.util.Scanner;
public class SwitchWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int nums = sc.nextInt();
        switch (nums){
            case 1:
                System.out.println("Day is sun");
                break;
            case 2:
                System.out.println("Day is mon");
                break;
            case 3:
                System.out.println("Day is tue");
                break;
            case 4:
                System.out.println("Day is wed");
                break;
            case 5:
                System.out.println("Day is thu");
                break;
            case 6:
                System.out.println("Day is fri");
                break;
            case 7:
                System.out.println("Day is sat");
                break;
            default:
                System.out.println("Invalid Option");
        }


    }

}
