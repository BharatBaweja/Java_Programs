import java.util.*;
class Shape{
	void Display(){
		System.out.println("Inside shape class");
	}
}
class Rectangle extends Shape{
	@Override
	void Display(){
		System.out.println("Inside Rectangle class");
	}
}
class Square extends Shape{
	@Override
	void Display(){
		System.out.println("Inside square class");
	}
}
class Circle extends Shape{
	@Override
	void Display(){
		System.out.println("Inside circle class");
	}
}
public class ShapeTest{
	public static void main(String args[]){
	Shape s[]= new Shape[10];
	char choice ='r';
	int i=0;
	Scanner in = new Scanner(System.in);
	while(choice !='q')
	{
		System.out.println("Enter your choice");
		choice = in.nextLine().charAt(0);
		switch(choice){
			case 'r' :	s[i]=new Rectangle();
						break;
			case 's' :	s[i] = new Square();
						break;
			case 'c' :	s[i] = new Circle();
						break;
			default  :	choice='q';
						break;
					}
					i++;
		}	
		System.out.println("Your choice is :");
		for(i=0;i<s.length;i++){
			if(s[i] instanceof Rectangle){
				System.out.println("Choice Rectangle");
				s[i].Display();
			}
			else if(s[i] instanceof Square){
				System.out.println("Choice Square");
				s[i].Display();
			}
			else if(s[i] instanceof Circle){
				System.out.println("Choice Circle");
				s[i].Display();
			}
		}
	}
}