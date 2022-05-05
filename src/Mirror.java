public class Mirror {
    public static void main(String[] args) {
        Students.schoolName = "Dimond School";


        Students s1 = new Students(1, "Bimal");
        Students s2 = new Students(2, "Mina");
        Students s3 = new Students(4,"Menuka");

        System.out.println(s3.schoolName);

    }
}

class Students{
    int id;
    String name;
    static String schoolName;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void printInfo(){
        System.out.println("Hello");
    }
}
