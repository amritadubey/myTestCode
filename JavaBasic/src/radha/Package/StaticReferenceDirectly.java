package radha.Package;

public class StaticReferenceDirectly {
	static StaticReferenceDirectly obj;
	static {
		System.out.println(StaticReferenceDirectly.obj);
		StaticReferenceDirectly.obj=new StaticReferenceDirectly();
	}

	public static void main(String[] args) {
		System.out.println(StaticReferenceDirectly.obj);

	}

}
