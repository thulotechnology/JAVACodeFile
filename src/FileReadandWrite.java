import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class FileReadandWrite {
    public static void main(String[] args) {
        String fileContent ="";
        try {
            File myObj = new File("fullname.txt");
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                String mydata = reader.nextLine();
                System.out.println(mydata);
                fileContent = mydata;
            }
            String newText = fileContent.replace("Menuka","renu");
            FileWriter myWriter = new FileWriter("fullname.txt");
            myWriter.write(newText);
            myWriter.close();

            reader.close();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}
