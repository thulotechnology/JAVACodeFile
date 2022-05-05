public class StudentWork {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bimal";
        s1.address = "Nepal";
        s1.rollNo = 12;
        s1.print();
    }
}

class Person{
    String name;
    String address;
}
class Student extends  Person{
    int rollNo;

    void print(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.rollNo);
    }
}
