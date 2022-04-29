import java.io.File;  // For File Work Import the File class

public class FileCreateInLocation{
    public static void main(String[] args) {
        try {
            File f = new File("C://hello/hello.txt");
            if (f.createNewFile()) {
                System.out.println("File is successfully created Name: " + f.getName());
            } else {
                System.out.println("Seems like file already exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. "+e.getMessage());
        }
    }
}