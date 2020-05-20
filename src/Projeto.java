import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura;
		
		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		
		while (largura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		
		while (altura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}
		
		sc.close();
	}
}