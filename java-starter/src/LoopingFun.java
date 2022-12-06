import java.util.Iterator;
import java.util.Scanner;

public class LoopingFun {

	public static void main(String[] args) {
//		for(int value = 45; value >= 15; value-=2) {
//				System.out.println(value);
//		}
		
//		Same with while
		
//		int value = 45;
//		
//		while(value >= 15) {
//			System.out.println(value);
//			value -= 2;
//		}
		
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a number");
	
	int value = scan.nextInt(), rev;
	
//	for(;value > 0;) {
//		rev = value % 10;
//		value = value / 10;
//		System.out.print(rev);
//	}
	
//	or with the while loop : better readable
	while(value > 0) {
		rev = value % 10;
		value = value / 10;
		System.out.print(rev);
	}
	
	int var = 450;
	
	do {
		System.out.println(var);
		var++;
	}while(var < 50);
		
		
		
		
		
		
		
	}
}























