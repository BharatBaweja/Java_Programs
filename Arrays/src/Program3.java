import java.util.*;
class Program3{
	public static void main(String args[]){//main method to sort the array
		Scanner in=new Scanner(System.in);
		int row;
		boolean flag;
		int dup;
		int n;
		int num[]=new int[5];
		System.out.println("Please enter the elements between 10 to 100 and no duplicates");
		for(row=0;row<5;row++){//saving the array
			System.out.println("Enter element[" +(row+1)+ "]:");
			n=in.nextInt();
		while(true){//checking the condition
			if(n>9 && n<101){
				break;
			}
			System.out.println("Please enter element between 10 to 100");
			n=in.nextInt();
		}
		flag=false;//checking for duplicacy
		for(dup=row;dup>=0;dup--){
			if(n==num[dup]){
				System.out.println("Duplicate entry");
				flag=true;
			}
		}
			if(flag==true){
				row=row-1;
				continue;
			}
			num[row]=n;//printing the sorted array
			System.out.println("==================");
			for(dup=0;dup<=row;dup++){
				System.out.println(num[dup]+ "    ");
			}
		}
	}
}

