package Polymorphism;

/*
 * The Polymorphism stands for one Name having the Multiple forms.
 * Method Overloading is one type of polymorphism. 
 * In Method Overloading,the method lies in the same class having the 
 * same method name with different Parameters of method.
 * It is also known as the compile time polymorphism.
 */
public class Main1 {
	//Creating the method
	public int Add(int a,int b) {
		return a+b;
	}
	//Same method with different parameter  
	public int Add (int a,int b,int c) {
		return a+b+c;
	}
	//same method with different Data type as parameter
	public double Add(double a,double b) {
		return a+b;
	}

	
	
	public static void main(String[] args) {
		Main1 m = new Main1();
		System.out.println("Method Overloading");
		System.out.println("It is also known as complie time Polymorphism");
		System.out.println(m.Add(10, 10));
		System.out.println(m.Add(10, 50, 20));
		System.out.println(m.Add(110.2, 23.3));
		
	}
}
