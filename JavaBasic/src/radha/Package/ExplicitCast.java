package radha.Package;

public class ExplicitCast {
	// we need to do some work
	// Happens when we assign a higher datatype to higher to the lower datatype in
	// our program
	// higher->lower
	// int->byte

	public static void main(String[] args) {
		int i = 100;
		byte b = (byte) i;

		int x = 97;

		char ch = (char) x;
		System.out.println(ch);

		int y = 130;
		byte z = (byte) y;
		System.out.println(z);

		int m = 612;
		byte n = (byte) m;
		char o = (char) n;
		System.out.println(o);
	}
}
