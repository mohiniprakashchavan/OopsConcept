

class MyConstr
{
	int i,j,k;
	MyConstr()
	{
		System.out.println("inside constructor");
		i=3;
		j=9;
		System.out.println("i="+i+"j="+j);
	}
	MyConstr(int i,int j)
	{
		System.out.println("with 2 argument");
		this.i=i;
		this.j=j;
	}
	
	MyConstr(int i,int j,int k)
	{
		System.out.println("with 2 argument");
		this.i=i;
		this.j=j;
		this.k=k;
	}
	
	void LargeNumber()
	{
		int l=(i>j)?i:j;
		System.out.println("largest is="+l);
	}
	
	void LargeNumber3()
	{
		int m=(i>j&&i>k)?i:(j>i&&j>k)?j:k;
		System.out.println("largest is="+m);
	}
}
public class ContructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyConstr ob=new MyConstr();
MyConstr ob1=new MyConstr(10,20);
MyConstr ob2=new MyConstr(10,20,30);


ob.LargeNumber();
ob1.LargeNumber();
ob2.LargeNumber3();

}

}
