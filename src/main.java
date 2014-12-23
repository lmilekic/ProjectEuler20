import java.math.BigInteger;


public class main {

	public static void main(String[] args) {
		BigInteger bigFactorial = factorial(100);
		int sum = sumDigits(bigFactorial.toString());
		System.out.println(sum);
	}

	private static int sumDigits(String bigNum) {
		int sum = 0;
		for(int i = 0; i < bigNum.length(); i++)
		{
			sum += bigNum.charAt(i) - '0';
		}
		return sum;
	}

	private static BigInteger factorial(int num) {
		BigInteger sum = BigInteger.valueOf(1);
		for(int i = 1; i <= num; i++)
		{
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		return sum;
		
	}

}
