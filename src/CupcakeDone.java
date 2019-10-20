
public class CupcakeDone implements Command{
	Cupcake cupcake;
	
	public CupcakeDone(Cupcake cupcake) {
		this.cupcake = cupcake;
	}
	
	public void execute() {
		cupcake.done();
	}
}
