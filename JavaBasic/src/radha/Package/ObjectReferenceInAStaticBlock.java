package radha.Package;

public class ObjectReferenceInAStaticBlock {
	static {
		ObjectReferenceInAStaticBlock obj=new ObjectReferenceInAStaticBlock();
		System.out.println(obj);
	}

	public static void main(String[] args) {

	}

}
