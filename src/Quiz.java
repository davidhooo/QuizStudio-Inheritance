package src;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {

    private ArrayList<Question> listOfQuestions = new ArrayList<>();

    public void addTrueFalseQuestion(String questionString) {
        TrueFalseQuestion newQuestion = new TrueFalseQuestion(questionString);
        listOfQuestions.add(newQuestion);
    }

    public void addMultipleChoiceQuestion(String questionString) {
        MultipleChoiceQuestion newQuestion = new MultipleChoiceQuestion(questionString);
        listOfQuestions.add(newQuestion);
    }

    public void addCheckboxQuestion(String questionString) {
        CheckboxQuestion newQuestion = new CheckboxQuestion(questionString);
        listOfQuestions.add(newQuestion);
    }

//    public String getInput() {
//        Scanner input = new Scanner(System.in);
//        String userInput;
//
//        do {
//            userInput = input.nextLine();
//        } while(!userInput.equals(""));
//
//        return userInput;
//    }

    public Question getQuestionAtIndex(int index) {
        return this.listOfQuestions.get(index);
    }

    public void printListOfQuestions() {
        for (Question question: listOfQuestions) {
           System.out.println(question.getQuestion());
        }
    }

    public void printQuestionAtIndex(int index) {
        if (index >= 0 && index < this.listOfQuestions.size()) {
            System.out.println(this.listOfQuestions.get(index).getQuestion());
        } else {
            System.out.println("Invalid Question Number.");
        }

    }

    //TO DO: add addQuestions for other type of questions
    // get input method (scanner) make input method to get answer

    //getQuestion
    //scanner method for input
    //isCorrect method

    //askQuestion method


//    System.out.println("Question 1: ");
//    System.out.println(question1.getQuestion());


//    do {
//        userInput = input.nextLine();
//    } while (!userInput.equals(""));
//
//    System.out.println("You entered: " + userInput);
//    System.out.println(quiz.question1.isCorrect(userInput));
//
//    System.out.println("The answer is: ");
//    System.out.println(quiz.question1.getAnswer());
//    System.out.println(quiz.question1.getQuestionType());


}
