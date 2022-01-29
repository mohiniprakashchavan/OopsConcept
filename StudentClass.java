//Student information using buffer reader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student
{
	int sage;
	String sname;
	float sfees;
	char gen;
	
	void input() throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
	  System.out.println("Enter name");
	  sname=br.readLine();
	  
	  System.out.println("Enter age");
	  sage=Integer.parseInt(br.readLine());
	  
	  System.out.println("Enter fees");
	  sfees=Float.parseFloat(br.readLine());
	  
	  System.out.println("Enter gen");
	  gen=(char)br.read();
	  
	  
	}
	
	void display()
	{
		System.out.println("name= "+sname);
		System.out.println("age= "+sage);
		System.out.println("fees= "+sfees);
		System.out.println("gender= "+gen);
	}
}
public class StudentClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Student s1=new Student();
	   //s1.input();
	  //s1.display();
		
		
		Student arr[]=new Student[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=new Student();
			arr[i].input();
			arr[i].display();
		}

	}

}
