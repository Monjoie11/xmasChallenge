package challenges;

public class Driver {

	public static void main(String[] args) {
		Methods meth = new Methods();
		
		
		  System.out.println(meth.challenge1223("racecar", "racecar"));
		  System.out.println(meth.challenge1223("racecar", "carecar"));
		  System.out.println(meth.challenge1223("racecar", "rare"));
		  
		  System.out.println(meth.challenge1226("Daniel", 'i'));
		  System.out.println(meth.challenge1226("Mississippi", 'i'));
		  
		  System.out.println(meth.challenge1230("Mississippi", 'i'));
		  System.out.println(meth.challenge1230("Mississippi", 'z'));
		 
		System.out.println(meth.challenge12("Mississippi"));
		System.out.println(meth.challenge12("this is a test to see how long a really really long string can be before recursioncauses a stackover flow which is an error and not an exception but apparently its longer than this so im giving up"));
	}
	
}
