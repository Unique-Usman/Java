package example;
/**
 * @author uniqueusman
 * 
 */
public class SubtractionProblem implements Question{
	
	private int x, y, answer;
	public SubtractionProblem() {
		// TODO Auto-generated constructor stub
		x = (int)(10 + 40*Math.random());
		y = (int)(30 * Math.random());
		answer = x - y;
	}
	@Override
	public String getProblem() {
		return "Compute " + x + " - " + y;
	}
	@Override
	public double getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}

}
