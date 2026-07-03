/*==========================================
 *           Quiz Application
 * ------------------------------------------
 * Main Class
 * ------------------------------------------
 * Entry point of the application.
 * ==========================================
 */
public class Main{
    public static void main(String[] args)
    {
        //Object of QuestinService class
        QuestionService service = new QuestionService();

        //Fetching methods from QuestionService class for display input/output
        service.playQuiz();
        service.printScore();
    }

}