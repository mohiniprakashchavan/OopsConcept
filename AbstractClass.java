package abstractmethod;


abstract class Animal
{
	void sleep()
	{
		System.out.println("class");
	}
	
	abstract void eat();
	
}

class Cow extends Animal
{
	void eat()
	{
		System.out.println("grass");
	}
	
	void feature()
	{
		System.out.println("cow has horns");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cow c=new Cow();
		c.eat();
		c.sleep();
		c.feature();
		
		Animal ob=new Cow();
		ob.eat();
		ob.sleep();
		//ob.feature();//refer only Animal class
     // Animal a=new Animal();  //we can not create the object of abstract class
	}

}
