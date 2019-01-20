import java.util.*;
class Program8
{
	public static void main(String args[])//main method to display total sales and total product sale
	{
		Scanner in = new Scanner(System.in);
		float array[][]=new float[4][5];
		int i;
		int j;
		int sp;
		float sales=0f;
		int product;
		float value;
		float Product_sales=0f;
		System.out.println("\n");
		for(i=0;i<4;i++){
			for(j=0;j<5;j++)
			{
				System.out.println("Please enter the value for product " +(j+1)+" by salesperson "+(i+1));
				array[i][j]=in.nextFloat();
			}
		}
		System.out.println("Product 1\t\t Product 2\t\t Product 3\t\t Product 4\t\t Product 5\t\t Total Sales");
		for(i=0;i<4;i++)
		{
			System.out.println("Salesperson "+(i+1));
			for(j=0;j<5;j++)
			{
				System.out.print(+array[i][j]+ "\t\t\t");
				sales=sales+array[i][j];
			}
			System.out.println(sales);
			sales=0;
		}
		System.out.println("Product sales are:");
		for(j=0;j<5;j++)
		{
			for(i=0;i<4;)
			{
			Product_sales=Product_sales +array[i][j];
			i++;
		}
		System.out.print(Product_sales+ "\t\t\t");
			Product_sales=0;
		}

	}
}