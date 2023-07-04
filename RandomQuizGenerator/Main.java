
public class Main {
	
	static double correctAnswer = 0;
	static int wrongAnswer = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Quiz");
		System.out.println("In this simple quiz, you will be asked 10 question and you have 2 attempt for each question,"
				+ "\n if you get it right at first you will be given full and half for the second attempt");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Question: "+ (i + 1));
			int res = AskQuestion.ask();
			
			if (res == 1) correctAnswer++;
			if (res == 0) correctAnswer += 0.5;
			if (res == -1) wrongAnswer++;
		}
		int numCorrectAns = 10 - wrongAnswer;
		System.out.println("You got: " + numCorrectAns + " number right");
		System.out.println("Your total Score is : " + correctAnswer);
	}
}
