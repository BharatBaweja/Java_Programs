import java.io.*;
import java.util.*;
class StudentFile{
	public static void main(String args[]){
		File F = null;
		Scanner in = new Scanner(System.in);
		try{
			Student s= new Student();
			F=new File("D:\\Coding\\Java_Programs\\FileHandling\\files\\Student.txt");
			FileWriter Fout=new FileWriter(F);
			BufferedWriter bout = new BufferedWriter(Fout);
			while(in.hasNext()){
				bout.write(s.Array());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}