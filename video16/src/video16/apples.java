package video16;
import java.util.Scanner;
public class apples {
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	tuna tunaObject = new tuna();
	
	System.out.println("Enter gf name here");
	String temp = input.nextLine();
	tunaObject.setName(temp);
	tunaObject.saying();
	}
}