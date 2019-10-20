
public class NotDoneState implements State {
	CupcakeMaker cupcake;
	
	public NotDoneState(CupcakeMaker cupcakeMaker) {
		this.cupcake = cupcakeMaker;
	}
	
	public void notDone() {
		System.out.println("You inserted a quarter");
		cupcake.setState(cupcake.getNotDoneState());
	}
	
	public void paid() {
		System.out.println("Your cupcake is not ready.");
	}
 
	public void done() {
		System.out.println("Your cupcake is not done yet");
	 }
 
	public String toString() {
		return "Waiting for order";
	}
}
