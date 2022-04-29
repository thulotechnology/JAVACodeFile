import java.io.File;  // For File Work Import the File class

public class Main{
    public static void main(String[] args) {
        try {


            for(int i =1; i<=100; i++){

                File f = new File(i+".txt");

                if (f.delete()) {
                    System.out.println("File is successfully " + f.getName());
                } else {
                    System.out.println("Seems like file already exist.");
                }
            }

        } catch (Exception e) {
            System.out.println("An error occurred. "+e.getMessage());
        }
    }
}