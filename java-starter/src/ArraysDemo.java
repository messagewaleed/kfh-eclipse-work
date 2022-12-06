
public class ArraysDemo {

	public static void main(String[] args) {
		
		
//		Type []identifier = new Type[size];
		
		char []values = new char[5];
		
//		double []marks;
//		
//		marks = new double[10];
		
		int []marks = {67, 89, 888, 1};
		
		
//		for(int index = 0; index < marks.length;index++) {
//			System.out.println(marks[index]);
//		}
		
//		Or with Java 5 enhanced for loop
		for(int value : marks) {
			System.out.println(value);
		}
		
		
		
//		new int[] {78, 89330, 8, 373}
		
		
		
		values[0] = 'x';
		values[1] = 'e';
		values[4] = 'y';
//		values[8] = 'i';//Fails at runtime :  ArrayOutOfBoundsException

	}

}
