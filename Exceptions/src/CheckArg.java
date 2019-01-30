import java.lang.Throwable;
class Check extends Exception{
	Check(String m){
		super(m);
	}
}
class CheckArg{
	public static void main(String args[]){
		int sum=0;
		boolean flag=false;
		try{
			if(args.length<5){
				throw new Check("number less than 5");
			}
			for(int i=0;i<args.length;i++){
				sum=sum+Integer.parseInt(args[i]);
			}
			flag=true;
			System.out.println("sum : " + sum);
		}
		catch(Check e){
			System.out.println(e.getMessage());
			}
		catch(Exception e){
			if(flag==false)
					System.out.println("Error non int args");
		}
	}
}