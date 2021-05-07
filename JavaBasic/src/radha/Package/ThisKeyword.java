package radha.Package;

public class ThisKeyword {
	String s= "Amrita";
	 
	ThisKeyword(){//It can only used in non-static context not in static contex...
		System.out.println(this);
		System.out.println(this.s);
	}

	 public void thisKeyword1(){//It can only used in non-static context not in static contex...
			System.out.println("Instance method");
			System.out.println(this.s);
		}
	public static void main(String[] args) {
		ThisKeyword s = new ThisKeyword();
		s.thisKeyword1();
		//new ThisKeyword();
		//new ThisKeyword();

	}

}
