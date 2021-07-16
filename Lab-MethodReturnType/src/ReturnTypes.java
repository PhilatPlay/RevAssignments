
public class ReturnTypes {
	
	public static void main(String[] args) {
		ReturnTypes rt = new ReturnTypes();
		
		// method should be invoked/called here
		
		rt.returnNothing();
		boolean b = rt.returnBoolean();
		
		System.out.println("The value of b is: " + b + ".");
	}
	
		//first method here
	public void returnNothing() {
		System.out.println("Inside of a void method.");
	}
	
	//a method that returns a boolean
    public boolean returnBoolean(){
    	return true;
    }
	
}
