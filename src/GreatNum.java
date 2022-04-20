public class GreatNum {
    public static void main(String[] args) {
        int a = 1000;
        int b = 20;
        int c = 130;

        if(a>b && a>c ){
            System.out.println("A is great");
        }else if(b>a && b>c){
            System.out.println("B is great");
        }else if(c>a && c> b){
            System.out.println("C is great");
        }else{
            System.out.println("Something went wrong");
        }
    }
}
