package Main;
import java.util.Scanner;

public class Main {
	public static void main (String[]args) {
		
		int number1;
		int number2;
		int sum;
		Scanner scan;
		scan =new Scanner(System.in);
		scan.useDelimiter(System.lineSeparator());
		
		System.out.println("Enter first nubmer: ");
			number1=scan.nextInt();
		System.out.println("Enter second number: ");
			number2=scan.nextInt();
		sum = add(number1, number2);
		System.out.println("The sum of your numbers is: " +sum);

		}
		public static int add(int number1, int number2) {
		return number1+number2;
		}
}
		
