import java.util.*;
class Date{
	int month;
	int day;
	int year;
	Date(){
		month=1;
		day=1;
		year=2000;
	}
	Date(int month,int day,int year){
		this.month=month;
		this.day=day;
		this.year=year;
	}
	void DisplayDate(){
		System.out.println(""+(day)+"/"+(month)+"/"(year)+"");
	}
}
	public class DateTest{
		public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
			Date d1=new Date();
			d1.DisplayDate();
			System.out.println("Please enter day");
			int day=in.nextInt();
			System.out.println("Please enter month");
			int month=in.nextInt();
			System.out.println("Please enter year");
			int year=in.nextInt();
			Date d2=new Date(day,month,year);
			d2.DisplayDate();
		}
	}
