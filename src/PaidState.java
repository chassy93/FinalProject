
public class PaidState implements State {

	CupcakeMaker cupcake;
	
	public PaidState(CupcakeMaker cupcakeMaker) {
		this.cupcake = cupcakeMaker;
	}
	
	public void notDone() {
	}
	
	public void paid() {
		System.out.println("Your cupcake is paid for.");
	}
 
	public void done() {
		System.out.println("Your cupcake is not done.");
	 }
 
	public String toString() {
		return "Please wait a moment.";
	}

}
