package radha.Package;

public class DefaultConstructor {
	int num;{
		System.out.println("Inside a default constructor");
		System.out.println("Inside a constructor");
		System.out.println("Inside a default");
	}

	public static void main(String[] args) {
		System.out.println("Inside The Main Method");
		new DefaultConstructor();
		new DefaultConstructor();
		new DefaultConstructor();

	}

}
