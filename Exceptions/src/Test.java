import java.lang.*;
import java.util.*;
class Test{
	int a=5;
	int b=0;
	int c;
	int array[]= new int[5];
	String s; 
	/*Test(){
		this.a=a;
		this.b=b;
		this.array=array;
		this.s=s;
		this.c=c;
	}*/
	void arrayexception(){
		array[8]=8;
		System.out.println(array[8]);
	}
	void Stringlength(){
		s=null;
		System.out.println(s.length());
	}
	int Divide(){
		return a/b;
	}
	int NumberFormatException1(){
		c=Integer.parseInt("Add");
		return c;
	}
	String Add(String s){
		return s;
	}
	public static void main(String args[]){
		Test t1 = new Test();
		try{
		t1.Stringlength();
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println();
	try{
			t1.arrayexception();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println();
	try{
			System.out.println(t1.Divide());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println();
	try{
			System.out.println(t1.NumberFormatException1());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println();
	try{
			System.out.println(t1.Add(null));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}