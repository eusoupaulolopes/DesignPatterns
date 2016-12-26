package command;

/**
 * Algumas vezes � necess�rio emitir solicita��es para objetos nada sabendo sobre
 *  a opera��o que est� sendo solicitada ou sobre o receptor da mesma.
 * @author Paulo Lopes
 *
 */
public class PressSwitch {
	public static void main(String[] args) {

		Light lamp = new Light();
		// Ligar Lampada 
		Command switchUp = new FlipUpCommand(lamp);
		// Desligar Lampada 
		Command switchDown = new FlipDownCommand(lamp);

		Switch mySwitch = new Switch();

		mySwitch.storeAndExecute(switchDown);
		mySwitch.storeAndExecute(switchUp);
	}



}
