package example;
public class MultiplicationProblem implements Question {

	private int x, y, answer;
	public MultiplicationProblem() {
		// TODO Auto-generated constructor stub
		x = (int)(10 + 40*Math.random());
		y = (int)(30 * Math.random());
		answer = x * y;
	}

	@Override
	public String getProblem() {
		// TODO Auto-generated method stub
		return "Compute " + x + " * " + y;
	}

	@Override
	public double getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}

}
