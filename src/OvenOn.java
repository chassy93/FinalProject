
public class OvenOn implements Command{
	Oven oven;
	
	public OvenOn(Oven oven) {
		this.oven = oven;
	}
	
	public void execute() {
		oven.on();
	}
}
