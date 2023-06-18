package Polymorphism;
/*
 * The Polymorphism stands for one Name having the Multiple forms.
 * Method Overriding is one type of polymorphism. 
 * In Method Overriding,the method having the same method name same Parameters
 * lies in the extending the child class.
 * It is also known as the Run-time polymorphism.
 */
class Add {
	// creating the method.
	public int Add1(int a, int b) {
		return a + b;
	}

	// Same method with different Data type as parameter.
	// Here's the method is overloaded with the different data-type as parameter. 
	public double Add1(double a, double b) {
		return a + b;
	}
}

//creating the method which extends  in the another class.
public class Mian2 extends Add {
	
	//override the method Add1 from the existing method.
	@Override
	public int Add1(int a, int b) {
		int c = 5;
		return a + b + c;
	}

	public static void main(String[] args) {
		Mian2 m = new Mian2();
		System.out.println("Method Overriding");
		System.out.println("It is also known as Runtime Polymorphism.");
		//output of overrided method.
		System.out.println(m.Add1(10, 10));
		System.out.println(m.Add1(20, 20));
		//output of method with different data-type as parameter.
		System.out.println(m.Add1(17, 89.9));

	}
}
