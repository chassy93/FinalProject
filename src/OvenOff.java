
public class OvenOff implements Command {
	Oven oven;
	
	public OvenOff(Oven oven) {
		this.oven = oven;
	}
	
	public void execute() {
		oven.off();
	}
}
