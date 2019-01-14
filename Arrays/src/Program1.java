import java.util.*; 
class Program1 {
	public static void main(String args[]) {// main method to find the index of an array element
		int num[]=new int[10];
		int rowcounter;
		int searchElement;
		boolean flag;
		Scanner in=new Scanner(System.in);
		//input from user
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
			System.out.println("Enter the element {"+(rowcounter+1)+"}: ");
			num[rowcounter]=in.nextInt();
			System.out.println();
			}
		//ask the elemnet to be searched
		System.out.print("Enter the element to be searched :");
		searchElement=in.nextInt();
		System.out.println("Elements in the array are:");
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
				System.out.println(num[rowcounter]);
		}
		//search for the element
		flag=false;
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
			if(num[rowcounter]==searchElement) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Element found at location :" +rowcounter);
		}
		else{
			System.out.println("-1");
		}
	}
}