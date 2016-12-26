package memento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Originator {
	private String state;
	private LocalDateTime date;

	public void set(String state) {
		System.out.println("Originator >> Setting state to " + state);
		this.state = state;
		this.date = LocalDateTime.now();
	}

	public Memento saveToMemento() {
		System.out.println("Originator >> Saving to Memento");
		return new Memento(this.state, this.date);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getSavedState();
		System.out.println("Originator >> Return state from Memento: " + this.state +"\n at: " +date.toString());
	}

	public class Memento {
		private final String state;
		private final LocalDateTime date;

		public Memento(String state, LocalDateTime date) {
			// TODO Auto-generated constructor stub
			this.state = state;
			this.date = date;
		}

		private String getSavedState() {
			return state;
		}

		public String getState() {
			return state;
		}

		public LocalDateTime getDate() {
			return date;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return state +" >> Criado em: "+ date.format( DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss.SSSSS")).toString();
		}
		
	 

	}

}
