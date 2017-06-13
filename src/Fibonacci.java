
public class Fibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		while(a < 1000)
		{
			System.out.print(a + " ");
			b = a + b;
			a = b - a;
		}
		System.out.println();
	}

}
