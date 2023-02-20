import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int A;
		int B;
		int C;
		int D;
		int DIFERENCA;
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		D = scanner.nextInt();
		DIFERENCA = (A * B - C * D);
		System.out.println("DIFERENCA = " + DIFERENCA);
		scanner.close();
		
		
	}

}
