//we can access data only using lower to higher specifier
 class Parent
{
	int id;
	public void display()
	{
		System.out.println("Parent class Display");
	}
}

class Child extends Parent
{
	 public void display() {
		
		super.display();
		System.out.println("Child class display");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child ob=new Child();
      ob.display();
      System.out.println("id "+ob.id);
 }

}