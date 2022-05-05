enum Gender{Male,Female,Other}

public class EnumWork {
    public static void main(String[] args) {
        for(Gender g: Gender.values()){
            System.out.println(g);
        }
    }
}




