package example;
public class AdditionProblem implements Question {

	private int x, y, answer;

	public AdditionProblem() {
		x = (int)(10 + 40*Math.random());
		y = (int)(30 * Math.random());
		answer = x + y;
	}
	@Override
	public String getProblem() {
		// TODO Auto-generated method stub
		 return "Compute the sum: " + x + " + " + y;
	}

	@Override
	public double getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}

}
