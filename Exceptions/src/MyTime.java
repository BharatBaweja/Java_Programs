class MyTime{
	private int hour;
	private int minute;
	private int second;
	MyTime(){
		hour=0;
		minute=0;
		second=0;
	}
	MyTime(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	void setTime(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;	
	}
	int getHour(){
		return hour;
	}
	int getMinute(){
		return minute;
	}
	int getSecond(){
		return second;
	}
	void setHour(int hour){
		this.hour=hour;
	}
	void setMinute(int minute){
		this.minute=minute;
	}
	void setSecond(int second){
		this.second=second;
	}
	public String toString(){
		if(minute<10)
			return (hour+":0"+minute+":"+second);
		else if(hour<10)
			return ("0"+hour+":"+minute+":"+second);
		else if(second<10)
			return (hour+":"+minute+":0"+second);
		else
		return (hour+":"+minute+":"+second);
	}
	String nextSecond(){
		second++;
		if(second==60){
			minute++;
			second=00;
			if(minute==60){
			hour++;
			minute=00;
		}
		if(hour==24){
			hour=00;
		}
		}
		return (hour+":"+minute+":"+second);
	}
	String nextMinute(){
		minute++;
		if(minute==60){
			hour++;
			minute=00;
			if(hour==24){
			hour=00;
		}
		}
		return (hour+":"+minute+":"+second);
	}
	String nextHour(){
		hour++;
		if(hour==24){
			hour=00;
		}
		return (hour+":"+minute+":"+second);
	}
	String previousSecond(){
		second--;
		if(second==00){
			minute++;
			second=59;
			if(minute==00){
			hour--;
			minute=59;
		}
		if(hour==00){
			hour=23;
		}
		}
		return (hour+":"+minute+":"+second);
	}
	String previousMinute(){
		minute--;
		if(minute==00){
			hour--;
			minute=59;
			if(hour==00){
			hour=23;
		}
		}
		return (hour+":"+minute+":"+second);
	}
	String previousHour(){
		hour--;
		if(hour==00){
			hour=23;
		}
		return (hour+":"+minute+":"+second);
	}
	

}