import java.util.*;

public class BakeryMenu implements Iterator  {
	static final int MAX_ITEMS = 4;
	int numberOfItems = 0;
	String[] menuItems;
	int position = 0;
	
	public BakeryMenu() {
		menuItems = new String[MAX_ITEMS];
		
		addItem("Chocolate Cupcake");
		addItem("RedVelvet Cupcake");
		addItem("SugarFree Cupcake");
		addItem("Vanilla Cupcake");
	}
	
	public void addItem(String name) {
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!");
		}else {
			menuItems[numberOfItems]=name;
			numberOfItems = numberOfItems +1;
		}
	}
	
	public String next() {
		String menuItem = menuItems[position];
		position = position +1;
		return menuItem;
	}
	
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		}else {
			return true;
		}
	}
	
	public String[] getMenuItem() {
		return menuItems;
	}

	
	public String toString() {
		return "Bakery Menu";
	}
	

}
