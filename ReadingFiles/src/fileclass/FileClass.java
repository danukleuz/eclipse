package fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args)  {


		File f = new File("C:\\Users\\Name\\Desktop\\Files\\file2.rtf");
		
		try(PrintWriter writer = new PrintWriter(f)){ //try with resources auto closes the resource
			writer.println("Yo man");
			writer.println("Wassup");
			writer.println("You chillin?");
			writer.println("Nah dogg");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		
		try(Scanner sc = new Scanner(f)){
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		

	}

}
