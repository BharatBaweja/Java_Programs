import java.io.File;
public class FileDemo{
	public static void main(String args[]){
		File f=null;
		String strs= "Test1.txt";
		try{
			//create new file
			f=new File(strs);
			String a = f.getAbsolutePath();
			//prints absolute path and length
			System.out.println("\n" +a);
			System.out.println("\nLength=" +f.length());
		}
		catch(Exception e){
			//if any io error occurs
			e.printStackTrace();
		}
	}
}