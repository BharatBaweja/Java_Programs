class AddressTest{
	public static void main(String args[]){
		EmpAddress e1=new EmpAddress();
		e1.Info();
		e1.monthlySalary();
		double yearlysalary=e1.monthlySalary*12;
		System.out.println("yearly salary is :" +yearlysalary);
		double salaryraise=yearlysalary/10;
		System.out.println("Total Salary after raise is :" +(yearlysalary+salaryraise));
		System.out.println("For second person:"); 
		EmpAddress e2= new EmpAddress("ABC "," ACD ",40000," 45/9 "," Gurgaon ",122001);
	        e2.Info();
			e2.monthlySalary();
			e2.Displayaddress();
			yearlysalary=e2.monthlySalary()*12;
			System.out.println("Yearly Salary:"+yearlysalary);
			salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

	}
}