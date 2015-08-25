package video15;
import java.util.Scanner;
public class applews {
	public static void main(String args[]){
		tuna tunaObject = new tuna();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name here");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
		
	}
}
