package Polymorphism;
//It is Example of method overriding.
class RBI {
	public int getROI() {
		return 7;
	}
}
//class A extends the properties of class RBI
class A extends RBI {
	public int getROI() {
		return 8;
	}
}
//class B extends the properties of class RBI
class B extends RBI {
	public int getROI() {
		return 9;
	}
}
//class A extends the properties of class RBI
class C extends RBI {
	public int getROI() {
		return 10;
	}
}
//class Bank extends the properties of class C
public class Bank extends C {
	//Main method
	public static void main(String[] args) {
		//Creating the object of class Bank,
		Bank a= new Bank();
		//object of class A
		A m = new A();
		//object of class B
		B n = new B();
		//object of class C
		C p = new C();
		System.out.println("Main Class:"+a.getROI());
		System.out.println("Class A:"+m.getROI());
		System.out.println("Class B:"+n.getROI());
		System.out.println("Class C:"+p.getROI());
	}

}
