package Hello;
class Bank{
	int getRateOfInterest() {
		return 0;
	}
}
class A1 extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class B extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
class C extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}
public class m1 {
public static void main(String[] args) {
	System.out.println("Method Overriding");
	A1 a =new A1();
    B b= new B();
    C c = new C();
    System.out.println(a.getRateOfInterest());
    System.out.println(b.getRateOfInterest());
    System.out.println(c.getRateOfInterest());
    
}
}
