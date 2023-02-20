import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int PROD, A, B;
        Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		B = scanner.nextInt();
		PROD = (A * B);
		System.out.println("PROD = " + PROD);
		scanner.close();

	}

}
