package command;

/** Command para desligar a luz **/
public class FlipDownCommand implements Command {
	private Light theLight;
	
	public FlipDownCommand(Light light) {
		theLight = light;
	}
	
	@Override
	public void execute() {
		theLight.turnOff();
	}

}
