import java.io.File;
import java.util.Scanner;

public class FileWorks {
    public static void main(String[] args) {
        try {
            File obj = new File("myfile.txt");
            Scanner reader = new Scanner(obj);

            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch (Exception ex){
            System.out.println("Error "+ex);
        }
    }
}
// WAP IN JAVA TO READ "birthday.txt"
