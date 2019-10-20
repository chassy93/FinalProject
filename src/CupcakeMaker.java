import java.util.Scanner;

public class CupcakeMaker {
	State notDoneState;
	State paidState;
	State doneState;
	State state = notDoneState;
	private static void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			String menuItem = (String)iterator.next();
			System.out.println(menuItem);
		}
	}
	public CupcakeMaker(Cupcake cupcake) {
		notDoneState = new NotDoneState(this);
		paidState = new PaidState(this);
		doneState = new DoneState(this);
	}
	
	public void notDone() {
		state.notDone();
	}
	
	public void paid() {
		state.paid();
	}
	
	public void done() {
		state.done();
	}
	
	void setState(State state) {
		this.state = state;
	}
	 
	 public State getState() {
		 return state;
	 }
	 
	 public State getNotDoneState() {
		 return notDoneState;
	 }
	 
	 public State getDoneState() {
		 return doneState;
	 }
	
	public static void main(String args[]) {
		//create remote&oven
		RemoteControl remote = new RemoteControl();
		Oven oven = new Oven();
		OvenOn ovenOn = new OvenOn(oven);
		OvenOff ovenOff = new OvenOff(oven);
		//notDoneState = new NotDoneState(this);
		Iterator bakeryMenu = new BakeryMenu();
		System.out.println("\nCupcake Menu");
		printMenu(bakeryMenu);
		
		Iterator icingMenu = new IcingMenu();
		Scanner scan = new Scanner(System.in);
		
		//cupcakeType
		System.out.println("\nWhat kind of cupcake?");
		String cupcakeType = scan.next();
		Cupcake cupcake = null;
		//cupcake.notDone();
		
		switch(cupcakeType) {
		case "Chocolate":
			cupcake = new ChocoCupcake();
			break;
			
		case "RedVelvet":
			cupcake = new RedVelvet();
			break;
			
		case "Vanilla":
			cupcake = new Vanilla();
			break;
			
		case "SugarFree":
			cupcake = new SugarFree();
			break;
			
		default:
			System.out.println("You haven't chosen a cupcake.");
			System.exit(0);
		}
		
		//icingType
		System.out.println("\nIcing Menu");
		printMenu(icingMenu);
		System.out.println("\nWhat kind of icing?");
		String icingType = scan.next();
		switch(icingType) {
		case "Chocolate":
			cupcake = new ChocoIce(cupcake);
			break;
			
		case "Buttercream":
			cupcake = new ButtercreamIce(cupcake);
			break;
			
		case "Sugar Free":
			cupcake = new SugarFreeIce(cupcake);
			break;
			
		default:
			System.out.println("You did not choose icing.");
			break;
		}
		
		//toppings
		System.out.println("Do you want sprinkles? Y/N");
		String toppings = scan.next();
		switch(toppings) {
		case "Y":
			cupcake = new Sprinkles(cupcake);
			break;
			
		case "N":
			break;
		}
		System.out.println(cupcake.getDescription()+" $"+cupcake.cost()+"\n");
		//State Paid
		cupcake.paid();
		
		CupcakeBake bake = new CupcakeBake(cupcake);
		CupcakeDone done = new CupcakeDone(cupcake);
		remote.setCommand(ovenOn);
		remote.buttonWasPressed();
		remote.setCommand(bake);
		remote.buttonWasPressed();
		remote.setCommand(done);
		remote.buttonWasPressed();
		remote.setCommand(ovenOff);
		remote.buttonWasPressed();

		//State Done
		cupcake.done();
	}
}
