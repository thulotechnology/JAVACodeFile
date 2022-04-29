public class ScopeEg {
    static int wordPopulation = 937267310;
    public static void main(String[] args) {
        // We can access
        System.out.println(wordPopulation);

        int tax = 10;

    }
    public static  void printDetails(){
        // We can access
        System.out.println(wordPopulation);

        //System.out.println(tax); // Not Possible because outside of the scope.
    }
}
