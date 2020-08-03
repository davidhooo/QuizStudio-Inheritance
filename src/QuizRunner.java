package src;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        float numberOfQuestion = 0;
        float numberOfCorrectAnswers = 0;
        Scanner input = new Scanner(System.in);

        quiz.addTrueFalseQuestion("Is a dog an animal? (enter TRUE or FALSE)");
        quiz.addMultipleChoiceQuestion("Which type of triangle has all sides equal length    A.Isosceles    B.Equilateral    C.Scalene (enter the letter only)");
        quiz.addCheckboxQuestion("Which numbers are even?    A.2    B.4    C.5    D.8    E.9 (enter letters only, separate only by space)");

        quiz.getQuestionAtIndex(0).setAnswer("true");
        quiz.getQuestionAtIndex(1).setAnswer("b");
        quiz.getQuestionAtIndex(2).setAnswer("a b d");

        System.out.println("Welcome to my freaking quiz! This will test your knowledge of biology, mathematics, and reading comprehension.\n");

        System.out.println(quiz.getQuestionAtIndex(0).getQuestionType() + ": " + quiz.getQuestionAtIndex(0).getQuestion());
        numberOfQuestion += 1;
        String userInput = input.nextLine();

        if (quiz.getQuestionAtIndex(0).isCorrect(userInput)) {
            System.out.println("Correct!" + "\n");
            numberOfCorrectAnswers += 1;
        } else {
            System.out.println("Incorrect...");
            System.out.println("The correct answer is: " + quiz.getQuestionAtIndex(0).getAnswer() + "\n");
        }

        System.out.println(quiz.getQuestionAtIndex(1).getQuestionType() + ": " + quiz.getQuestionAtIndex(1).getQuestion());
        numberOfQuestion += 1;
        userInput = input.nextLine();
        if (quiz.getQuestionAtIndex(1).isCorrect(userInput)) {
            System.out.println("Correct!" + "\n");
            numberOfCorrectAnswers += 1;
        } else {
            System.out.println("Incorrect...");
            System.out.println("The correct answer is: " + quiz.getQuestionAtIndex(1).getAnswer() + "\n");
        }

        System.out.println(quiz.getQuestionAtIndex(2).getQuestionType() + ": " + quiz.getQuestionAtIndex(2).getQuestion());
        numberOfQuestion += 1;
        userInput = input.nextLine();
        if (quiz.getQuestionAtIndex(2).isCorrect(userInput)) {
            System.out.println("Correct!");
            numberOfCorrectAnswers += 1;
        } else {
            System.out.println("Incorrect...");
            System.out.println("The correct answer is: " + quiz.getQuestionAtIndex(2).getAnswer());
        }

        System.out.println("You have completed the quiz.");
        float score = (numberOfCorrectAnswers/numberOfQuestion) * 100;
        System.out.println("Your score is: " + score + "%");
    }
}
