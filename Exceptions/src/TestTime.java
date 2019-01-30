class TestTime extends Exception{
	public static void main(String args[]){
		MyTime t1=new MyTime(3,59,59);
		try{
			System.out.println(t1.toString());
			if(t1.getHour()>23||t1.getHour()<0||t1.getSecond()<0||t1.getSecond()>60||t1.getMinute()<0||t1.getMinute()>60){
				throw new IllegalArgumentException("Error,wrong hour,minute or second");
			}
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println(t1.nextSecond());
		System.out.println(t1.nextMinute());
		System.out.println(t1.nextHour());
		System.out.println(t1.previousSecond());
		System.out.println(t1.previousMinute());
		System.out.println(t1.previousHour());
	}
}