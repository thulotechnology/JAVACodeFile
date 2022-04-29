public class EvenWork {
    public static void main(String[] args) {
        System.out.println("Even number between 10 to 100: ");
        evenNumbers(10, 100);
        System.out.println("Even number between 1000 to 1020");
        evenNumbers(1000,1020);
    }

    public static void evenNumbers(int start, int end){
        for (int i = start; i<=end; i++ ){
            if (i%2 == 0){
                System.out.println(i+ " is even.");
            }
        }
    }
}
