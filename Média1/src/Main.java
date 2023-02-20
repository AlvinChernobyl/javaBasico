import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double A, B, MEDIA;
       A = scanner.nextDouble() * 3.5;
       B = scanner.nextDouble() * 7.5;
       MEDIA = (A + B) / 11.0;	   
       System.out.printf("MEDIA = %.5f\n", MEDIA);
       scanner.close();
	}
}
