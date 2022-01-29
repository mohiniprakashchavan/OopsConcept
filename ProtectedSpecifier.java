import java.util.Scanner;

class MyStudent
{
	protected int id;
	protected String name;
	protected float fees;
}

class StudentData extends MyStudent
{
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		id=sc.nextInt();
		
		System.out.println("Enter the name");
		name=sc.nextLine();
		
		System.out.println("Enter the fees");
		fees=sc.nextFloat();
		sc.close();
	}
	
	void display()
	{
		System.out.println("id= "+id);
		System.out.println("name= "+name);
		System.out.println("fees= "+fees);
	}
	
}
public class ProtectedSpecifier {

	public static void main(String[] args) {
		
		StudentData s=new StudentData();
		s.input();
		s.display();

	}
	

}
