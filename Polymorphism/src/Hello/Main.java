package Hello;
class A{
	//Changing the parameters of the method
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a ,int b,int c) {
		return a+b+c;
	}
	//Changing the Data types of method 
	static double add(double a,double b) {
		return a+b;
	}
}
public class Main {
public static void main(String[] args) {
	
	//Changing the parameters of the method
		System.out.println(A.add(10,10));
		
		System.out.println(A.add(10, 10, 10));
    //Changing the Data types of the method
		System.out.println(A.add(10.2, 10.5));
	}
	
}
