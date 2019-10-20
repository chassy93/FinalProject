
public class ChocoIce extends CupcakeDecorator {
	public ChocoIce(Cupcake cupcake) {
		this.cupcake = cupcake;
	}
	
	public String getDescription() {
		return cupcake.getDescription()+", Chocolate Icing";
	}
	
	public double cost() {
		return .30 + cupcake.cost();
	}
}
