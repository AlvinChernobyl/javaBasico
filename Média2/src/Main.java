import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A;
		double B;
		double C;
		double MEDIA;
		A = scanner.nextDouble() * 2;
		B = scanner.nextDouble() * 3;
		C = scanner.nextDouble() * 5;
		MEDIA = (A + B + C) / 10;
		System.out.printf("MEDIA = %.1f\n", MEDIA);
scanner.close();
	}

}
