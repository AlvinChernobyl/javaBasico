import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigo1;
		int codigo2;
		int nupeca2;
		int nupeca1;
		double valpeca1;
		double valpeca2;
		double total1;
		codigo1 = scanner.nextInt();
		nupeca1 = scanner.nextInt();
		valpeca1 = scanner.nextDouble();
		codigo2 = scanner.nextInt();
		nupeca2 = scanner.nextInt();
		valpeca2 = scanner.nextDouble();		
		total1 = (nupeca1 * valpeca1) + (nupeca2 * valpeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total1);
		scanner.close();

	}

}
