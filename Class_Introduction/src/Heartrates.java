import java.util.*;
class Heartrates{
	private String fName;
	private String lName;
	int MaxHeartrate;
	DateofBirth date;
	Heartrates(String fName,String lName,int d,int m,int y){
		this.fName=fName;
		this.lName=lName;
		date=new DateofBirth(d,m,y);
	}

	void setfName(String fName){
		this.fName=fName;
	}
	String getfName(){
		return fName;
	}
	void setlName(String lName){
		this.lName=lName;
	}
	String getlName(){
		return lName;
	}
	int AgeCalculator(){
		return 2019-date.year;
	}

	void MaxHeartrateCalculator(){
		MaxHeartrate=220-AgeCalculator();
		System.out.println("Maximum Heartrate beats per minute is "+MaxHeartrate);
	}
	void TargetheartrateCalculator(){
		float target1=(50*MaxHeartrate)/100;
		float target2=(85*MaxHeartrate)/100;
		System.out.println("Target Heartrate Range is :"+(target1)+ "-" +(target2));
	}

}