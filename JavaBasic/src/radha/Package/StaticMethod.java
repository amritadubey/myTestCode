package radha.Package;

public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		//StaticMethod.method();

	}
	static {
		System.out.println("Inside Static Block");
		StaticMethod.method();

	}
	static void method(){
		System.out.println("Inside Method");
	}

}
