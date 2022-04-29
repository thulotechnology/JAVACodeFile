public class LearnReverse {
    public static void main(String[] args) {
        String name = "Bmial";
        String rev = reverseWord(name);
        System.out.println(rev);
    }

    public static String reverseWord(String word){
        // TODO
        String rev = "";
        for(int i=word.length()-1; i>=0; i--){
            rev += word.charAt(i);
        }
     return rev;
    }
}
