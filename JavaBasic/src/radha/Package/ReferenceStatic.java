package radha.Package;

public class ReferenceStatic {
	static ReferenceStatic obj=new ReferenceStatic();
	static {
		System.out.println(ReferenceStatic.obj);
		ReferenceStatic.init();
	}

	public static void main(String[] args) {
		System.out.println(ReferenceStatic.obj);

	}
	static void init() {
		ReferenceStatic.obj=new ReferenceStatic();
	}

}
