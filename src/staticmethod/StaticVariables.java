package staticmethod; //package//

public class StaticVariables { // class//

	// variable declaration//

	int a = 10;

	void show() { //Method//
		System.out.println("This is show method");
	}
  
	static { //Static Method//
		System.out.println("This is static method");
		System.out.println("No object");
	}
	
	 static void display() {
		 System.out.println("STATIC");
	 }
	
	
	
	
	public static void main(String[] args) { // Main//
		//class obj = new class ();//
		
		StaticVariables sv = new StaticVariables();
		System.out.println(sv.a); //obj.variable declaration//
		sv.show();
		display();
		StaticVariables.display();
		

	}

}
