/*==========================================
 *       Question Service Class
 * ------------------------------------------
 * Handles the complete quiz logic.
 * - Initializes questions
 * - Displays quiz
 * - Accepts user answers
 * - Calculates and displays score
 * ==========================================
 */
import java.util.Scanner;

public class QuestionService{

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    //Default Constructor
    public QuestionService()
    {
        questions[0] = new Question(1,"size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2,"size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3,"size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4,"size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5,"size of boolean", "1", "6", "4", "8", "1");
    }

    //Method for Quiz Play
    public void playQuiz()
    {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        for (Question q : questions) {

            System.out.println("\n======================================");
            System.out.println("           QUESTION " + q.getId());
            System.out.println("======================================");

            System.out.println(q.getQuestion());
            System.out.println();

            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());

            System.out.print("\nEnter your answer: ");
            selection[i] = sc.nextLine();

            i++;
        }
        sc.close();
    }

    //Method for showing score and result of quiz
    public void printScore()
    {
        int score = 0;
        System.out.println("\n======================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("======================================");

        for (int i = 0; i < questions.length; i++) {

            Question q = questions[i];

            System.out.println("\nQuestion " + q.getId() + ": " + q.getQuestion());
            System.out.println("Your Answer    : " + selection[i]);
            System.out.println("Correct Answer : " + q.getAnswer());

            if (selection[i].equals(q.getAnswer()))
            {
                System.out.println("Correct");
                score++;
            }
            else
            {
                System.out.println("Wrong");
            }
        }

        System.out.println("\n======================================");

        //Calculate percentage from final score
        System.out.println("Final Score : " + score + " / " + questions.length);
        double percentage = (score * 100.0) / questions.length;
        System.out.printf("Percentage : %.2f%%\n", percentage);

        //Based on percentage showing your performance in quiz
        if (percentage >= 80)
        {
            System.out.println("Excellent!");
        }
        else if (percentage >= 60)
        {
            System.out.println("Good Job!");
        }
        else if (percentage >= 40)
        {
            System.out.println("Keep Practicing!");
        }
        else
        {
            System.out.println("Practice More and Try Again!");
        }

        System.out.println("======================================");

    }
}
