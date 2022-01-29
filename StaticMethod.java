package staticandnonstatic;
class Pr1{
	int id;
	public static void display() { 
		System.out.println(" Parent class display function");
	}
}

class Ch1 extends Pr1{
	int k;
	/*public  void display() { //static method cannot be overriden
	 //static method are inheritated you can use it with ref to class or object
		
		System.out.println("child class display function");
		
	}*/
	void child_function() {
		System.out.println("child_function");
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		Pr1 ob = new Pr1();
		Parent.display();
		ob.display();
		Ch1.display();
		Ch1 cob = new Ch1();
		cob.display();
		}
}
