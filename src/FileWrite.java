import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{

            FileWriter fw = new FileWriter("hello.txt");
            fw.write("Hello");
            fw.close();
        }catch (Exception ex){
            System.out.println("Error");
        }
    }
}
// WAP IN JAVA TO WRITE "Happy Birthday" in birthday.txt