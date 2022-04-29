import java.util.Scanner;

public class VowelWork {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter One Char: [We will take first char if you enter multiple]");
        String value = ab.nextLine();
        char ch = value.toLowerCase().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
                System.out.println("consonant");
            default:
                System.out.println("Invalid");
        }


    }
}
