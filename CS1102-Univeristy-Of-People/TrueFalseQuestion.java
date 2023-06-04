import java.util.Arrays;
import javax.swing.*;
public class TrueFalseQuestion extends Question {
	String answer; 
	String[] validAnswersTrue = {"t", "true", "y", "yes"};
	String[] validAnswersFalse = {"f", "false", "n", "no"};
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}
	public TrueFalseQuestion(String question, String answer) {
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons,"TRUE");
		addButton(buttons,"False");
		this.question.add(buttons);
		initQuestionDialog();
		if ( Arrays.asList(validAnswersFalse).contains(answer)) {
			correctAnswer = "FALSE";
		}else {
			correctAnswer = "TRUE";
		}
	}

}
