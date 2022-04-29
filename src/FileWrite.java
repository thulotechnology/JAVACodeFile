import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("index.html");
            fw.write("<h1> Hello World </h1> <p> This is para </p>");
            fw.close();
        }catch (Exception ex){
            System.out.println("Error");
        }
    }
}
// WAP IN JAVA TO WRITE "Happy Birthday" in birthday.txt