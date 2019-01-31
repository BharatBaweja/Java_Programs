class EmpAddress{
	String firstName;
	String lastName;
	double monthlySalary;
	Address add;
	EmpAddress(){
		firstName=" ";
		lastName=" ";
		monthlySalary=0;
	}
	EmpAddress(String firstName,String lastName,double monthlySalary,String firstLine,String secondLine,int pinCode){
		this.firstName=firstName;
		this.lastName=lastName;
		this.monthlySalary=monthlySalary;
		add=new Address(firstLine,secondLine,pinCode);
	}
	void Info(){
		System.out.println(firstName+ " "+lastName);
	}
	double monthlySalary(){
		if(monthlySalary<0){
			System.out.println("Please write correct salary");
		}
		else{
			this.monthlySalary=monthlySalary;
		}
		return monthlySalary;
	}
	void Displayaddress(){
		System.out.println("Address is :");
		System.out.println(add.firstLine+ " "+add.secondLine+" "+add.pinCode );
	}
}
