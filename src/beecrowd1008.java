import java.util.Locale;
import java.util.Scanner;

public class beecrowd1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int number, hrs;
		double hourValue, salary;
		
		number = sc.nextInt();
		hrs = sc.nextInt();
		hourValue = sc.nextDouble();
		salary = hourValue * hrs;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();

	}

}
