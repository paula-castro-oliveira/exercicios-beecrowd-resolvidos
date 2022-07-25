import java.util.Locale;
import java.util.Scanner;

public class beecrowd1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double volume = (4/3.0) * 3.14159 * (n * n * n );
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}

}
