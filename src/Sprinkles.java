
public class Sprinkles extends CupcakeDecorator {
	public Sprinkles(Cupcake cupcake) {
		this.cupcake = cupcake;
	}
	
	public String getDescription() {
		return cupcake.getDescription()+" , Sprinkles";
	}
	
	public double cost() {
		return .40 + cupcake.cost();
	}
}
