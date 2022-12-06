import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = scan.nextInt();

		switch (num) {
		case 10:
			System.out.println("TEN");
			break;
		case 15:
			System.out.println("FIFTEEN");
			break;
		case 2:
			System.out.println("TWO");
			break;
		default:
			System.out.println("NO MATCH FOUND");
		}

	}

}
