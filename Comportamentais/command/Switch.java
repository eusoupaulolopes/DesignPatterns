package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe invocadora do Command
 * @author Paulo Lopes
 *
 */


public class Switch {
	
	private List<Command> history = new ArrayList<Command>();
	
	public void storeAndExecute(Command cmd){
		this.history.add(cmd);
		cmd.execute();
	}
	
}

