import java.util.Iterator;

public class MenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;
	
	public MenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position +1;
		return menuItem;
	}
	
	public boolean hasNext() {
		if (position >= items.length || items[position]==null) {
			return false;
		}else {
			return true;
		}
	}
}
