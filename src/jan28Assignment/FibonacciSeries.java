package jan28Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number = 10, number1 = 0, number2 = 1;
		
        System.out.print("Fibonacci Series of "+number+" numbers:");

        for (int i = 1; i <= number; i++)
        {
            System.out.print(number1+" ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
	}

}
