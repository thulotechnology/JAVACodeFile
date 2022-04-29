public class RandomNum {
    public static void main(String[] args) {

        // Math.floor(Math.random() * (max-min+1) + min)
       for(int i=0; i<50; i++){
           System.out.println(Math.floor(Math.random()*(10-5+1))+5);
       }

    }
}

// Create Random Number Between 5-10;