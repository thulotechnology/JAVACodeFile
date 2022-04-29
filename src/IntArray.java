public class IntArray {
    public static void main(String[] args) {
        double[] expenses = {10.0, 20.0, 30.0, 40.0, 50.0, 60,70};

        int totalLength = expenses.length;

        double total = 0;

        for(int i=0; i<totalLength; i++){
            total += expenses[i];
        }

        System.out.println("Total is "+total);
        System.out.println("Avg is "+(total/totalLength));

    }
}
// WAP IN JAVA TO ADD PRICE OF 3 PRODUCT and Find Average Price.
