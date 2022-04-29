import java.io.File;  // Import the File class

public class Main {
    public static void main(String[] args) {
        File f = new File("myfile.txt");
        if (f.delete()) {
            System.out.println("Successfully deleted the file: " + f.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}