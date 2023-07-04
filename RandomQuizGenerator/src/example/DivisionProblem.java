package example;
public class DivisionProblem implements Question {
	
	private double x, y, answer;
	public DivisionProblem() {
		// TODO Auto-generated constructor stub
		x = (int)(10 + 40*Math.random());
		y = (int)(30 * Math.random());
		answer = x / y;
	}

	@Override
	public String getProblem() {
		// TODO Auto-generated method stub
		return "Compute " + x + " / " + y;
	}

	@Override
	public double getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}
}