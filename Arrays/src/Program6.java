import java.util.*;
class Program6{
	public static void main(String args[]){//main method to print a 2D array
		Scanner in=new Scanner(System.in);
		int i;
		int j;
		int row;
		int col;
		int number;
		int array[][]=new int[10][10];
		System.out.println("Please enter the number of rows");
		row=in.nextInt();
		System.out.println("Please enter the number of columns");
		col=in.nextInt();
		System.out.println("Please enter the elements one by one");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				number=in.nextInt();
				if(number>99){
				System.out.println("Please enter two digit integer");
				number=in.nextInt();}
				array[i][j]=number;
		}
	}
			for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(array[i][j]%2!=0){
					array[i][j]=array[i][j]*2;
				}
				else{
					continue;
				}
			}
		}
	System.out.println("Array is:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(array[i][j]+ "\t ");
			}
			System.out.println();}}}
