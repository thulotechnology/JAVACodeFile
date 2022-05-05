public class MetWork {
    public static void main(String[] args) {
    String fullname = getFullName("Menuka", "Pradhan");
        System.out.println(fullname);
    }

    public static void printInfo(){
        System.out.println("Hii I am printing something");
    }

    public static void fullName(String fname, String lname){
        System.out.println("Full name is "+fname + " " + lname );
    }

    public static String getFullName(String fname, String lname){
        return  fname + " " + lname;
    }

    public static double getHeight(){
        return  6.0;
    }
}
