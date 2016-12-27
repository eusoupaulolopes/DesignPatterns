package factorymethod;

public abstract class Documento {

	void abrir(){
		System.out.println("Documento >> Abrir Doc.");
	}
	void fechar(){
		System.out.println("Documento >> Fechar Doc.");
	}
	void gravar(){
		System.out.println("Documento >> Gravar Doc.");
	}
}
