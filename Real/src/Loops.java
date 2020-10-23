
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 5a
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x+=2;
		}
		System.out.println("\r\n");
		
		//Step 5b
		int y = 100;
		while (y >= 0) {
			System.out.println(y);
			y-=3;
		}
		System.out.println("\r\n");
		
		//Step 5c		
		for(int z = 1; z <= 100; z += 2) {
		System.out.println(z);
		}
		System.out.println("\r\n");
		
		//Step 5d
		for(int number = 0; number <= 100; number++) {
			
			if (number%3 == 0 && number%5 == 0) {
				System.out.println("Hello World");
			}
			else if (number%3 == 0) {
				System.out.println("Hello");
			}
			else if (number%5 == 0) {
			System.out.println("World");
			}
			else {System.out.println(number);
			}
		}

	}
}