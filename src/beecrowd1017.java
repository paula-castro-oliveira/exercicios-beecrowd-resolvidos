import java.util.Locale;
import java.util.Scanner;

public class beecrowd1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidade;
		double qteLitros;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		
		qteLitros = (double) (tempo * velocidade) / 12;
		
		System.out.printf("%.3f%n", qteLitros);
		
		
		
		sc.close();

	}

}
