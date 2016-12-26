package singleton;

public class SingletonClass {
	private static SingletonClass sc;
	
	private String singleText;
	
	public String getSingleText() {
		return singleText;
	}

	public void setSingleText(String singleText) {
		this.singleText = singleText;
	}

	public static SingletonClass getInstance(){
		if(sc == null){
			synchronized (SingletonClass.class){
				if(sc == null){
					sc = new SingletonClass();
				}
			}
		}
		return sc;
	}
	
	private SingletonClass(){
		 
	}
}
