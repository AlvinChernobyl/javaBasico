import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int funcionario;
		int horastrabalhadas;
		double htrabalho;
		double salario;
		
		funcionario = scanner.nextInt();
		horastrabalhadas = scanner.nextInt();
		htrabalho = scanner.nextDouble();
		salario = htrabalho * horastrabalhadas;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		scanner.close();
		
	}

}
