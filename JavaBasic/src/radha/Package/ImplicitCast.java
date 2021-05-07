package radha.Package;

public class ImplicitCast {
	//It's mean it happens automatically
	//Happens when u assign a lower datatype to a higher datatype in our program
	//(primitive)
	//lower-> higher
	//byte-> int

	public static void main(String[] args) {
		byte b=20;
		int i=b;
		System.out.println(i);
		
		char ch='A';
		int x=ch;
		System.out.println(x);

	}

}
