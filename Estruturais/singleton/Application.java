package singleton;

/**
 * Testando Sngleton
 * @author Paulo Lopes
 *
 */
public class Application {

	public static void main(String[] args) {
		SingletonClass single = SingletonClass.getInstance();
		// 
		single.setSingleText("Meu texto s� meu");
		
		SingletonClass outroSingle = SingletonClass.getInstance();
		
		
		
		System.out.println(outroSingle.getSingleText());
		

	}

}
