import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int R;
		double total;
		R = scanner.nextInt();
		total = (4/3.0) * 3.14159 * Math.pow(R,3);
		System.out.printf("VOLUME = %.3f\n",total);
		scanner.close();
	}

}
