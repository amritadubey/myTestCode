package com.example.CoreJavaDemo;

public class Student {
	int age;
	String name;
	

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student ob1=new Student(30, "jyoti"); 
		Student ob=new Student();
		ob.setAge(23);
		ob.setName("Radha");
       method1();
       ob.method2();
       ob1.method2();
	}
	
	static void method1() {
	System.out.println("Inside method1");
	}
	void method2() {
		System.out.println("Inside method222");
		System.out.println(this.getAge());
		System.out.println(this.getName());
	
		}
	
	static {
		System.out.println("Inside the static block");
		method1();
	}

}
