import java.util.Scanner;

class Data
{
	private int age;
	private String name;
	private float fees;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the fees");
		fees=sc.nextFloat();
	}
	
	void display()
	{
		System.out.println("name= "+name);
		System.out.println("age= "+age);
		System.out.println("fees= "+fees);
	}
}
public class AccessSpecifier {

	public static void main(String[] args) {
	Data d=new Data();
    d.input();
    d.display();
	}

}
