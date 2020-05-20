import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, altura, area, perimetro;
		int opcao;

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

		area = largura * altura;
		perimetro = (largura + altura) * 2;

		System.out.println();
		System.out.println("MENU:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.print("Digite uma opcao: ");
		opcao = sc.nextInt();

		while (opcao != 3) {
			if (opcao == 1) {
				System.out.println();
				System.out.print("AREA = " + area);
				System.out.println();
			}
			if (opcao == 2) {
				System.out.println();
				System.out.print("PERIMETRO = " + perimetro);
				System.out.println();
			}
			if (opcao != 1 && opcao != 2) {
				System.out.println();
				System.out.print("OPÇÃO INVALIDA");
				System.out.println();
			}
			
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = sc.nextInt();
		}
		
		if (opcao == 3) {
			System.out.println();
			System.out.print("FIM DO PROGRAMA!");
		}
		

		sc.close();
	}
}