package memento;
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	public static void main(String[] args) {
		// List of possible memento restore;
		List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();

		Originator originator = new Originator();
		originator.set("st1");
		savedStates.add(originator.saveToMemento());
		originator.set("st2");
		savedStates.add(originator.saveToMemento());
		originator.set("st3");
		savedStates.add(originator.saveToMemento());
		originator.set("st4");
		savedStates.add(originator.saveToMemento());
		
		originator.restoreFromMemento(savedStates.get(0));
		
		System.out.println("Statements avaliable:");
		//savedStates.forEach(st -> System.out.println("State: " +st.getState() ));
		/** Estilo Java8 **/
		savedStates.forEach(System.out::println);
		
	}
}
