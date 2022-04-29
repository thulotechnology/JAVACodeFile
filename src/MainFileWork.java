import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class MainFileWork {
    public static void main(String[] args) {
        String fullName = "";
        try {
            FileWriter f_Name = new FileWriter("fname.txt");
            FileWriter l_Name= new FileWriter("lname.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name: ");
            String fname = sc.nextLine();
            System.out.println("Enter last name: ");
            String lname = sc.nextLine();
            // Save to File
            f_Name.write(fname);
            l_Name.write(lname);

            f_Name.close();
            l_Name.close();



            File myObj1 = new File("fname.txt");
            File myObj2 = new File("lname.txt");
            Scanner reader1 = new Scanner(myObj1);
            Scanner reader2 = new Scanner(myObj2);
            while (reader1.hasNextLine()) {
                String mydata = reader1.nextLine();
                System.out.println(mydata);
                fullName = mydata;
            }
            while (reader2.hasNextLine()) {
                String mydata = reader2.nextLine();
                System.out.println(mydata);
                fullName += mydata;
            }
            FileWriter full_Name = new FileWriter("fullname.txt");
            full_Name.write(fullName);
            full_Name.close();
            System.out.println("Full name is "+fullName);

        } catch (Exception e) {
            System.out.println("An error occurred. "+e.getMessage());
        }
    }
}
