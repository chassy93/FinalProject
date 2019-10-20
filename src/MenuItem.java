
public class MenuItem {
	String name;
	String description;
	boolean sugarfree;
	double price;
	
	public MenuItem(String name, String description, boolean sugarfree, double price) {
		this.name = name;
		this.description = description;
		this.sugarfree = sugarfree;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isVegetarian() {
		return sugarfree;
	}
}
