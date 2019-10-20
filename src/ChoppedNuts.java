
public class ChoppedNuts extends CupcakeDecorator {
	public ChoppedNuts(Cupcake cupcake) {
		this.cupcake = cupcake;
	}
	
	public String getDescription() {
		return cupcake.getDescription()+" , Chopped Nuts";
	}
	
	public double cost() {
		return .40 + cupcake.cost();
	}
}
