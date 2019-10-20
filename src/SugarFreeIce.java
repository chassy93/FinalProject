
public class SugarFreeIce extends CupcakeDecorator {
	public SugarFreeIce(Cupcake cupcake) {
		this.cupcake = cupcake;
	}
	
	public String getDescription() {
		return cupcake.getDescription()+", Sugar Free Icing";
	}
	
	public double cost() {
		return .30+cupcake.cost();
	}
}
