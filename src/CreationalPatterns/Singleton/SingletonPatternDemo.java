package CreationalPatterns.Singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		//illegal construct
	    //Compile Time Error: The constructor SingleObject() is not visible
		//Singleton object = new Singleton();
		
		Singleton object = Singleton.getInstance();
		object.showMessage();
	}

}
