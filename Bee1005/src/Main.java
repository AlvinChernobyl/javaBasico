import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, media;
		
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		
		media = (a * 3.5 + b * 7.5) / 11.0;
		
		System.out.printf("Media = %.5f\n", media);

	

	}

}
