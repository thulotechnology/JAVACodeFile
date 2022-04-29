import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("myfile.txt");
        if(myFile.delete()){
            System.out.println("File Deleted Successfully "+ myFile.getName());
        }else{
            System.out.println("Error while deleting file.");
        }
    }
}
// Delete birthday.txt file