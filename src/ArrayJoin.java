import java.util.Arrays;

public class ArrayJoin {
    public static void main(String[] args) {
        String [] names = {"Babita", "Gita"};
        String [] names2 = {"Rama", "Sita"};


        String[] both = Arrays.copyOf(names, names.length + names2.length);
        System.arraycopy(names2, 0, both, names.length, names2.length);

        for(String name: both){
            System.out.println( name);
        }


    }
}
