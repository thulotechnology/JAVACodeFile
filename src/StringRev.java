public class StringRev {
    public static void main(String[] args) {
    String fullname = getFullName("Binod", "Sharma");
        System.out.println(fullname);
    }

    public static String getFullName(String fname, String lname){
        return  fname + " " + lname;
    }
}
