import java.util.*;
import java.io.*;
class FileDemo1{
	public static void main(String args[]){
	File f = null;
	String temp;
	try{
		f=new File("D:\\Coding\\Java_Programs\\FileHandling\\files\\File.txt");
		FileWriter fout=new FileWriter(f);
		BufferedWriter bout = new BufferedWriter(fout);
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter the String");
		while(in.hasNext()){
			temp=in.nextLine();
			if(temp.equals("exit")){
				break;
			}
			else
			bout.write(in.nextLine());
			bout.newLine();
		}
		bout.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}