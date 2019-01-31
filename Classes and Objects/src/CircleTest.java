import java.util.*;
class Circle{
	int radius;
	final double PI=3.14;
	Circle(){
		radius=1;
	}
	Circle(int radius){
		this.radius=radius;
	}
	void area(){
		System.out.println("Area is: " +(PI*radius*radius)+ " " );
	}
	void Circumfrence(){
		System.out.println("Circumfrence is:" +(2*PI*radius)+ "");
	}
	void Display(){
		System.out.println("Radius is "+radius+" ");
		area();
		Circumfrence();
	}
}
	public class CircleTest{
		public static void main(String args[]){
			Scanner in=new Scanner(System.in);
			Circle c1=new Circle();
			c1.Display();
			System.out.println("Enter the radius :");
			int radius=in.nextInt();
			Circle c2=new Circle(radius);
			c2.Display();

		}
	}
