class Cal
{
	void add(int i,int j) {
		int sum=i+j;
		System.out.println("Addition  of two int is= "+sum);
	}
	
	void add(int a,float b) {
		float c=a+b;
		System.out.println("addition of int float is= "+c);
	}
	
	void add(float x,double y)
	{
		double z=x+y;
		System.out.println("addition of float double is= "+z);
	}
	
	void add(byte a,byte b){
		byte d=(byte) (a+b);
		System.out.println("addition of byte and byte is= "+d);
	}
	
	void add(short i,short j)
	{
		short ans=(short) (i+j);
	}
	
	
}
public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c=new Cal();
		c.add(8,1);
	    c.add(8, 4.2f);
	    c.add(6, 5);
	    c.add(10, 5.0f);
        c.add((short)65,(short)6);
        c.add((byte)6,(byte)54);
        
	}

}
