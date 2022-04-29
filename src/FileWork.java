import java.io.File;
public class FileWork {
    public static void main(String[] args) {
        File f = new File("hello.txt");
       try{
           if(f.createNewFile()){
               System.out.println("File Created Successfully.");
           }else{
               System.out.println("Error while creating file.");
           }
       }catch (Exception ex){
           System.out.println("Exception Issue");
       }
    }
}
// WAP TO CREATE A FILE NAMED "myfile.csv";