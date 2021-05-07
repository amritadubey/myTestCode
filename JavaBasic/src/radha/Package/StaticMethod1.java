package radha.Package;

public class StaticMethod1 {

	public static void main(String[] args) {
System.out.println("Inside the main method");
	}
static void method() {
	System.out.println("Inside method");
}
static {
	System.out.println("Calling a Method");
	StaticMethod1.method();
}
}
