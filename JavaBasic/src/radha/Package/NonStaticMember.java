package radha.Package;
public class NonStaticMember {
	int num;
	NonStaticMember(){
		System.out.println("Inside the Constructor");
	}
	{
		System.out.println("Inside the non-static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMember();
	}
	

}
