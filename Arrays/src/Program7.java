import java.util.*;
class Program7{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int i;
		int array[]=new int[5];
		int choice;
		int count=0;
		int count1=0;
		int sum=0;
		int sum1;
		int max;
		int max2=array[0];
		int min;
		int frequency=0;
		char a;
		do{
			System.out.println("Please enter the element one by one");
			for(i=0;i<5;i++){
				System.out.println("Enter element "+(i+1)+" :");
				array[i]=in.nextInt();
			}
			System.out.println("Select one of the following options :");
			System.out.println("1 for seeing elements of array");
			System.out.println("2 for seeing sum of elements of array");
			System.out.println("3 for seeing largest element of array");
			System.out.println("4 for seeing smallest element of array");
			System.out.println("5 for seeing second largest element of array");
			System.out.println("6 for seeing sum of alternate elements of array");
			System.out.println("7 for seeing count of even elements of array");
			System.out.println("8 for seeing occurence of given elements of array");
			System.out.println("Enter your choice :");
			choice=in.nextInt();
			switch(choice){
				case (1): {
					System.out.println("Array is:");
					for(i=0;i<5;i++){
				System.out.println(array[i]);}
				break;
			}
				case(2):{
					for(i=0;i<5;i++){
					sum=sum+array[i];
				}
				System.out.println(sum);
				break;
				}
				case(3):{
					max=array[0];
					for(i=0;i<5;i++){
							if(max<array[i]){
								max=array[i];}}
							System.out.println("Largest element is :");
							System.out.println(max);
					break;
				}
				case(4):{
					min=array[0];
					for(i=0;i<5;i++){
							if(array[i]<min){
								min=array[i];}}
							System.out.println("Smallest element is :");
							System.out.println(min);
					break;
				}
				case(5):{
					max=array[0];
					for(i=0;i<5;i++){
							if(max<array[i]){
								max=array[i];}}
					for(i=0;i<5;i++){
							if(array[i]>max2 && array[i]<max){
								max2=array[i];}}
							System.out.println("Second Largest element is :");
							System.out.println(max2);
						break;
				}
				case (6):{
						sum1=array[0] +array[2]+array[4];
					System.out.println("Sum of alternate elements is :"+sum1);
					break;
				}
				case(7):{
					for(i=0;i<5;i++){
						if(array[i]%2==0){
							count++;
						}
					}
					System.out.println("Even numbers are "+count);
					break;
				}
				case(8):{
					System.out.println("Please enter the number whose frequency you want to check");
					frequency=in.nextInt();
					for(i=0;i<5;i++){
						if(array[i]==frequency){
							count1++;
						}
					}
					System.out.println("Frequency is :" +count1);
				}
					break;
				}
			System.out.println("Press N if you want to exit or press any key to continue");
			a=in.next().charAt(0);
		}
		while(a!='N');
	}
}