import java.util.*;
import java.lang.*;
class One{
	public static void main(String args[])//main method to find the roots of quadratic equation
{
	double root1;
	double root2;
	double D;
	Scanner in=new Scanner(System.in);
	System.out.println("Please enter the coffecients of the quadratic equation starting with the coffecient of x^2 ");
	int number1=in.nextInt();
	int number2=in.nextInt();
	int number3=in.nextInt();
	D=number2*number2-4*number1*number3;
	if(D<0){
	System.out.println("real roots do not exist");}
	root1=(-number2+ Math.sqrt(D))/2*number1;
	root2=(-number2- Math.sqrt(D))/2*number1;
	System.out.println("Roots of the equation are:");
	System.out.println(root1);
	System.out.println(root2);
}}