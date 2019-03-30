package randomNumber;

import java.util.Random;

public class RandomNumber {

		public void randomNumber(int num) {
			Random random = new Random();
			
			System.out.println("Random numbers are");
			
			for(int i=0;i<num;i++) {
			
				System.out.println(random.nextInt(100));			
		}
	 }
		public static void main(String[] args) {
			
		RandomNumber rn = new RandomNumber();
		rn.randomNumber(5);
	}

}
