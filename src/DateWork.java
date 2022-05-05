import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateWork {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();

        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDayOfWeek());
// WAP IN JAVA TO FIND PERSON AGE, By asking person his Date of Birth. Use Current Date


//        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);

//        LocalTime lt = LocalTime.now();
//        System.out.println(d + " Hello " + lt);


    }
}
