import java.util.*;
class Program4{//main method to sort arrays using functions
	static Scanner in=new Scanner(System.in);
	static int row;
	static boolean flag;
	static int dup;
	static int n;
	static int num[]=new int[5];
	static void Array(){
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
	
			public static void main(String args[]){
				Array();
			}
		}


	
