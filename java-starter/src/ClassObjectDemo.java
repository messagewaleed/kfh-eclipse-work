
public class ClassObjectDemo {

	public static void main(String[] args) {
		
		
//		Type identifier = new Type();
		
		Human ref = new Human();//New object created
		
//		Human omer;
//		
//		omer.legs = 2;
		
//		omer = new Human(); //New Object
		
		
		
//		omer.sleep();
		
		
//		new Human();//Works
		
		new Human().legs = 2;
		
		
		
		
		
		
		ref.legs = 2;
		ref.eyes = 2;
		
		ref.eat();
		
		ref.sleep();

	}

}


class Human{
	int legs, eyes;
	
	void eat() {
		System.out.println("Inside Human's eat...");
	}
	void sleep() {
		System.out.println("Inside Human's sleep");
	}
}
