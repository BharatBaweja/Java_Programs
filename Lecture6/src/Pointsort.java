import java.util.*;
class Pointsort{
static Scanner in = new Scanner(System.in);
		static Point array[] = new Point[10];
		static int i;
		static int j;
		static int number;
		static double x;
	    static double y;
	static	Point temp = new Point();

	static void Save(){
		System.out.println("Please enter the number of pair of elements you want to sort");
		number=in.nextInt();
		for(i=0;i<number;i++){
			System.out.println("Enter the element"+(i+1));
			System.out.println("Enter the value of x:");
			x=in.nextDouble();
			System.out.println("Enter the value of y:");
			y=in.nextDouble();
			array[i]=new Point(x,y);
		}
	}
static void Sort(){
		for(i=0;i<number;i++){
			for(j=0;j<number;j++){
				if(array[i].getY()>array[j].getY()){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Sorted is:");
		for(i=0;i<number;i++){
		System.out.println(array[i].getX()+","+array[i].getY());
			}
		}

	public static void main(String args[]){
	Save();
	Sort();
		
	}
}