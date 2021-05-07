package com.example.CoreJavaDemo;

public class StaticMethodDemo {
static int a=10;

	static void method1() {
	System.out.println("Inside method1");
	System.out.println(a);

}

	int multi(int a, int b) {
		//System.out.println("Inside method2");
		//System.out.println(a);
		return a*b;
		
	}
	
	public static void main(String[] args) {
	
		StaticMethodDemo obj=new StaticMethodDemo();
		StaticMethodDemo obj1=new StaticMethodDemo();
		int b=obj.multi(3,4);
		int b1=obj.multi(30,4);
		System.out.println(b);
		System.out.println(b1);
		//System.out.println(a);
	}
}