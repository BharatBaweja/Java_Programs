import java.util.*;
class Program5{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int i;//for loops
		int j;
		int k=0;
		int num1;//for limit of loops
		int num2;
		int num3;
		int a[]=new int[10];//for saving array
		int b[]=new int[10];
		int c[]=new int[20];
		System.out.println("Please enter the number of elements of array 1");
		num1=in.nextInt();
		System.out.println("Please enter the number of elements of array 2");
		num2=in.nextInt();
		System.out.println("Please enter the elements of array 1");
		for(i=0;i<num1;i++){
			System.out.println("Enter element ["+(i+1)+"]:");
			a[i]=in.nextInt();
		}
		System.out.println("Enter the elements of array 2");
		for(j=0;j<num2;j++){
			System.out.println("Enter element ["+(j+1)+"]:");
			b[j]=in.nextInt();
		}//printing arrays
		System.out.println("Entered arrays are");
		System.out.println("Array 1:");
		for(i=0;i<num1;i++){
			System.out.println(a[i]);
		}
		System.out.println("Array 2:");
				for(j=0;j<num2;j++){
			System.out.println(b[j]);
		}//sorting arrays
		num3=num1+num2;
		i=0;
		j=0;
		System.out.println("Sorted array is:");
    	while(i<num1&&j<num2){//ascending order
    		if(a[i]<b[j]){
    			c[k++]=a[i++];
    		}
    		else{
    			c[k++]=b[j++];
    		}
    	}
    	while(i<num1){
    		c[k++]=a[i++];
    	}
    	while(j<num2){
    		c[k++]=b[j++];
    	}
    	k=0;
    	while(k<num3){
    		System.out.println(c[k]+ "\t");
    		k++;
    	}
} }
  

	

	
