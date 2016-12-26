package command;
/**
 * Command to switch on Lamps
 * @author Paulo Lopes
 *
 */
public class FlipUpCommand implements Command {
	private Light theLight;
	
	public FlipUpCommand(Light light) {
		theLight = light;
	}
	
	@Override
	public void execute() {
		theLight.turnOn();
	}
}
