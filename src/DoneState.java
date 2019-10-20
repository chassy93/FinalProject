
public class DoneState implements State {

	CupcakeMaker cupcake;
	
	public DoneState(CupcakeMaker cupcakeMaker) {
		this.cupcake = cupcakeMaker;
	}
	
	public void notDone() {
	}
	
	public void paid() {
		System.out.println("Your cupcake is paid for.");
	}
 
	public void done() {
		System.out.println("Your cupcake is done.");
	 }
 
	public String toString() {
		return "Have a nice day.";
	}

}
