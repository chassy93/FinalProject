
public abstract class Cupcake {
	String location;
	String description = "Cupcake Mold";
	public void notDone() {
		System.out.println("Cupcake is not done.");
	}
	public void paid() {
		System.out.println("Cupcake has been paid for.");
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public Cupcake() {
	}
	
	public void bake() {
		System.out.println("Cupcake is baking.");
	}
	
	public void done() {
		System.out.println("Cupcake is done.");
	}
}
