
public class CupcakeBake implements Command {
	Cupcake cupcake;
	
	public CupcakeBake(Cupcake cupcake) {
		this.cupcake = cupcake;
	}
	
	public void execute() {
		cupcake.bake();
	}
}
