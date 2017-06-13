
public class SimplePrime {
	public static void main(String[] args) {
		for(int n = 2; n < 100; n++)
		{
			boolean isPrime = true;
			for(int i = 2; i < n; i++) // ineffizient, aber einfach
			{
				if(n % i == 0) // rest 0? => n ist teilbar durch i
				{
					isPrime = false;
					break; // optional, bricht aus der for(i = ...) Schleife aus
				}
			}
			if(isPrime)
			{
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}
	
}
