package video7;
import java.util.Scanner;
public class apples {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Please enter first number");
		fnum = input.nextDouble();
		System.out.println("Please enter second number");
		snum = input.nextDouble();
		answer = fnum + snum;
		System.out.println("Your answer is "+answer);
	}
}
