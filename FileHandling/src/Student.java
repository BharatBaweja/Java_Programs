import java.util.*;
class Student{
	float Cgpa;
	int SerialNum;
	char Grade;
	String FirstName;
	int number;
	int i;
	Student details[];
	Scanner in = new Scanner(System.in);
 	Student(){
 		SerialNum=1;
 		Cgpa=9.1f;
 		Grade='A';
 		FirstName="Bharat";

 	}
 	Student(int SerialNum,String FirstName,float Cgpa,char Grade){
 		this.SerialNum=SerialNum;
 		this.FirstName=FirstName;
 		this.Cgpa=Cgpa;
 		this.Grade=Grade;
 	}
 	void Array(){
 		System.out.println("Please enter number of students");
 		number=in.nextInt();
 		Student details[] = new Student[number];
 		for(i=0;i<details.length;i++){
 			System.out.println("Enter Serial number");
 			SerialNum=in.nextInt();
 			System.out.println("Enter FirstName");
 			in.nextLine();
 			FirstName=in.nextLine();
 			System.out.println("Enter CGPA");
 			Cgpa=in.nextFloat();
 			System.out.println("Enter Grade");
 			Grade=in.next().charAt(0);
 			details[i]=new Student(SerialNum,FirstName,Cgpa,Grade);
 		}
 	}

}