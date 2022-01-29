

class X

{
	private int id;
	public  float salary;
	
	X(int id)
	{
		this.id=id;
	
		System.out.println("X constructor "+id);
	}
}

class Y extends X
{
	Y(int id)
	{
		
		super(id);
		System.out.println("Y constructor "+id);
		//System.out.println("salary="+salary);

	}
}

class Z extends Y
{
	Z(int id,float f)
	{
		super(id);
		salary=f;
		System.out.print("Z constructor ");
		System.out.println("salary="+salary);

	}
}
public class ConstructorExecutionInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z1=new Z(20,2100.6f);
		System.out.println("salary "+z1.salary);
		

	}

}
