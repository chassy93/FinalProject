
public class ButtercreamIce extends CupcakeDecorator {
	public ButtercreamIce(Cupcake cupcake) {
		this.cupcake = cupcake;
	}
	
	public String getDescription() {
		return cupcake.getDescription()+", Buttercream Icing";
	}
	
	public double cost() {
		return .30 + cupcake.cost();
	}
}
