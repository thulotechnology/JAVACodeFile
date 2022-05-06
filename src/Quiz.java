import java.util.ArrayList;
import java.util.Scanner;
enum Answer{OptionA, OptionB, OptionC, OptionD, Error}
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(new Question("What is Java?","Programming Language", "HTML", "Compiler", "Mouse", Answer.OptionB));
        questions.add(new Question("What is Java?","Programming Language", "HTML", "Compiler", "Mouse", Answer.OptionC));
        questions.add(new Question("What is Java?","Programming Language", "HTML", "Compiler", "Mouse", Answer.OptionB));

        int total = 0;
        for(Question q: questions){
            System.out.println(q.qustion+ "Enter [1-4]: ");
            int userInput = sc.nextInt();
            Answer userans = Answer.Error;
            switch (userInput){
                case 1:
                    userans = Answer.OptionA;
                    break;
                case 2:
                    userans = Answer.OptionB;
                    break;
                case 3:
                    userans = Answer.OptionC;
                    break;
                case 4:
                    userans = Answer.OptionD;
                    break;
            }
            if(userans.equals(q.correctOption)){
                // Correct
                total++;
            }
        }

        System.out.println("Your score is "+total + "out of "+questions.size());
    }
}

class Question{
    String qustion;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    Answer correctOption;

    public Question(String qustion, String optionA, String optionB, String optionC, String optionD, Answer correctOption) {
        this.qustion = qustion;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }
}
