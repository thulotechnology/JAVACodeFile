public class ReturnWork {
    public static void main(String[] args) {
       double total =  add(50.2,3);

        System.out.println("Tax is "+total);
    }

    public static int add(int a, int b){
        return  a +b;
    }
    public static double add(double a, double b){
        return  a +b;
    }

    public  static int add(int num1, int num2, int c){
        return  num1 +num2+ c;
    }
}
// WAP IN JAVA TO SUBTRACT 2 NUMBERS [int, double ] using return type.
//[4 Min]