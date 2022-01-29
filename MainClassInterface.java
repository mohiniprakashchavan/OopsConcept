package interfacep;


interface MyInterface
{
	int i=10;  //by deafault public static final
	void m1();
	void m2();
	void m3();
	//void m4();
	
}

interface AnotherInterface extends MyInterface
{
	void m4();
}
class B implements AnotherInterface
{

	@Override
	public void m1() {
		
		System.out.println("m1 method");

		
	}

	@Override
	public void m2() {
		
		System.out.println("m2 method");

		
	}

	@Override
	public void m3() {
		
		System.out.println("m3 method");

		
	}

	@Override
	public void m4() {
		
		System.out.println("m4 method");

		
	}
	
}
 class A implements MyInterface
{

	@Override
	public void m1() {
		
		System.out.println("m1 method");
		
	}
	public void m2() {
		
		System.out.println("m2 method");
		
	}
	public void m3()
	{
		System.out.println("M3 called");
	}
	
}
public class MainClassInterface {

	public static void main(String[] args) {
	   A ob=new A();
		ob.m1();
		ob.m2();
		ob.m3();
		System.out.println(ob);
		
		B b1=new B();
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		
		System.out.println(b1);

		

	}

}
