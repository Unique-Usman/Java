
public class Quiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question question = new TrueFalseQuestion("Programming is fun!","y");
		question.check();
		question = new TrueFalseQuestion("Programming is boring!","f");
		question.check();
		question = new TrueFalseQuestion("Nigeria is home","y");
		question.check();
		question = new TrueFalseQuestion("African is my continent!","y");
		question.check();
		question = new TrueFalseQuestion("Jannah is the goal!","y");
		question.check();
		question = new MultipleChoiceQuestion("What is your favorite programming language\n","Java","Python","C","C++","Rust", "a");
		question.check(); 
		question = new MultipleChoiceQuestion("What is the fastest programming language\n","Java","Python","C","C++","Rust", "c");
		question.check(); 
		question = new MultipleChoiceQuestion("What is the slowest programming language\n","Java","Python","C","C++","Rust", "B");
		question.check(); 
		question = new MultipleChoiceQuestion("What is the most popular programming language\n","Java","Python","C","C++","Rust", "B");
		question.check(); 
		question = new MultipleChoiceQuestion("What is the most used programming language\n","Java","Python","C","C++","Rust", "B");
		question.check(); 
		question.showResults();
	}
}