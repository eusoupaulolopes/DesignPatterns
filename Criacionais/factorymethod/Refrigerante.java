package factorymethod;


/**
 * 
 * @author Paulo Lopes
 *
 */
abstract class Refrigerante {
	private String nome;
	
	public String getName(){
		return nome;
	}
	
	public void setName(String nome){
		this.nome = nome;
	}
	
	public void abrir(){
		System.out.println("Abrir >> "+getName());
	}
}
