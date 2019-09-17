package map103lab2;

public class RandomQuizHelper {

    private String[] questions = new String[5];
    private String[] answers = new String[5];

    RandomQuizHelper() {
        questions[0] = "What is the best model In the world ?";
        questions[1] = "What is the best car In the world ?";
        questions[2] = "What is the best city In the world  ?";
        questions[3] = "What is the best friend In the world ?";
        questions[4] = "What is the best grocery store In the world  ?";

        answers[0] = "Gigi Haddid";
        answers[1] = "TOFAS Sahin";
        answers[2] = "Ankara";
        answers[3] = "Mr. Bean";
        answers[4] = "Tesco";
    }

    public boolean getResult(int resultIndex, String answer) {

        if ( answers[resultIndex].equals(answer) ){
        return true;
        } else {
             return false;
             }
        
    }

    public String getQuestion(int getIndexResult) {

        return questions[getIndexResult];
    }

}
