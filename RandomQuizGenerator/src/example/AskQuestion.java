package example;
import java.util.Scanner;
public class AskQuestion {
	
	static int ask() {
		 int quizType = (int) ((Math.random() * 4) + 1);
		 Question que;
		 if (quizType == 1) que = new AdditionProblem();
		 else if (quizType == 2) que = new SubtractionProblem();
		 else if (quizType == 3) que = new MultiplicationProblem();
		 else que = new DivisionProblem();
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println(que.getProblem());
		 double ans = input.nextDouble();
		 if (ans == que.getAnswer()) {
			 System.out.println("You get the answer right at the first attempt");
			 return 1;
		 }
		 else {
			 System.out.println("Your answer is wrong try again once");
			 ans = input.nextDouble();
			 if (ans == que.getAnswer()) {
				 System.out.println("You get the answer right at the first try");
				 return 0;
			 }
		 } 
		 System.out.println("You are wrong,the correct answer is: " + que.getAnswer());
		 return -1;
	}
}
 