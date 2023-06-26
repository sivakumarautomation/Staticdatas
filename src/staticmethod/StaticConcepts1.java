package staticmethod; //package//

public class StaticConcepts1 { //class//
	
	    public void show() { //Method//
	    	
	    	System.out.println("This is show method");
			
		}
	    
	    static {
	    	System.out.println("Welcome");
	    }
	
	
	
	public static void main(String[] args) { //main//
		//class obj = new class();//
		
		StaticConcepts1 sc = new StaticConcepts1();
		sc.show();
		
		
	}

}
