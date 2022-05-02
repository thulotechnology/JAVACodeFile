public class ArrayFinderWork {
    public static void main(String[] args) {
        String[] names = {"New York", "California", "Tokyo", "Phuket",};
        String toChceck = "Tokyo";
        boolean isAvailable = false;
        for(String name : names){
            if(name.equals(toChceck)){
                isAvailable = true;
            }
        }
        if(isAvailable){
            System.out.println(toChceck + " is available in array.");
        }else{
            System.out.println(toChceck + " is not available in array.");
        }
    }
}
