package staticandnonstatic;

class Parent{
	int id;
	static String cname="Microsoft";
	public static void display() { 
		//System.out.println(" Parent class display function "+id);//error
		System.out.println("static method can access only static data "+cname);
	}
	void non_static_mathod() {
		 System.out.println(" Parent class display function "+id);
		System.out.println("static method can access only static data "+cname);
	}
}

class child extends Parent{
	int k;
	/*public  void display() { //static method cannot be overriden
	 //static method are inheritated you can use it with ref to class or object
		
		System.out.println("child class display function");
		
	}*/
	void child_function() {
		System.out.println("child_function");
	}
}
public class NonStaticMethod {
	public static void main(String[] args) {
		Parent ob = new Parent();
		Parent.display();
		ob.display();
		child.display();
		child cob = new child();
		cob.display();
		}
}