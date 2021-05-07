package Wrapper.Classes;
//Wrapper class help us to convert primitive types to object types.

//-We need this mainly when we work with collection of API layer on...
//Each primitive type has a corresponding class...

public class PrimitivesAndObjects {

	public static void main(String[] args) {
		int x = 100;
		Integer y = Integer.valueOf(x);
		int z=y.intValue();

	}

}
