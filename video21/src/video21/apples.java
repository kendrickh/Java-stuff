package video21;
import java.util.Scanner;
public class apples {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade, average;
		int counter = 0;
		
		while(counter<10){
			System.out.println("Please insert grade");
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/10;
		System.out.println("You average is "+average);
	}
}
