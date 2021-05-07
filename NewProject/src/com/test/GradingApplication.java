package com.test;

public class GradingApplication {

	public static void main(String[] args) {
		
int maths=12,physics=37,chemistry=12;

int average=maths+physics+chemistry;

if (maths<35&& physics<35&&chemistry<35){
	
System.out.println("Result Fail");

}else if(average<=59){
	
	System.out.println("Grade C");
	
}else if(average<=69){
	
	System.out.println("Grade B");
	
}else {
	
	System.out.println("Grade A");
}


}
}