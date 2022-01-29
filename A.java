package p1;

import p2.B;

class AceesM
{
	private int id;
	String name;
	protected float fees;
	public AceesM(int id, String name, float fees, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.cname = cname;
	}
	public  String cname;
}
public class A {

	public static void main(String[] args) {
	AceesM a=new AceesM(1,"moni",348.6f,"mastii");
	//System.out.println("id="+a.id);
	System.out.println("name="+a.name);
	System.out.println("cname="+a.cname);
	System.out.println("fees="+a.fees);

     B b1=new B(23,"rani",675.6f,"redf"); 
    // System.out.println("Emp name="+b1.ename);//protected error
      System.out.println("Emp Company="+b1.cname);
      // System.out.println("Emp id="+b1.eid);//private
     // System.out.println("Emp salary="+b1.salary);//deafault error can not be accessed
	}

}
