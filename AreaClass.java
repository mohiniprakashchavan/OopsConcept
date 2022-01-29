import java.io.BufferedReader;
import java.io.InputStreamReader;

class Area
{
void reactangleArea()
	{
		float hight=7;
		int width=5;
		float area=hight*width;
		System.out.println("Area of reactangle= "+area);
	}
	
	int squareArea( int s)
	{
	   int area=s*s;
	   System.out.println("Area of square is ="+area);
		return area;
	}
	float circleArea(float r)
	{
		float pi=3.14f;
		float area=pi*r*r;
		System.out.println("area of circle is="+area);
		return area;
	}
}
public class AreaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		a.reactangleArea();
		a.circleArea(5.6f);
		a.squareArea(8);
		//InputStreamReader is=new InputStreamReader(System.in);
	   //	BufferedReader br=new BufferedReader(is);
	}

}
