package map103lab2;

import java.util.Scanner;

public class MAP103Lab2 {

    public static void main(String[] args) {
        try ( 
                Scanner input = new Scanner(System.in)) {
            int questionNumber = (int) (Math.random() * 5);
            RandomQuizHelper helper = new RandomQuizHelper();
            String question = helper.getQuestion(questionNumber);
            String answer = "";
            System.out.print(question);
            answer = input.next();
            if (helper.getResult(questionNumber, answer) == true) {
                System.out.print("You are correct!");
            } else {
                System.out.print("You are not correct.");
            }
        }
    }
}
