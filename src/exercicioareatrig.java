import java.util.Locale;
import java.util.Scanner;
public class exercicioareatrig {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura,area,perimetro;
		int opçao;
		area = 0;
		perimetro = 0;		
		System.out.println("Digite a largura do retangulo:");
		largura = sc.nextDouble();
		while(largura <= 0) {
			System.out.println("o valor deve ser positivo.Tente novamente");
			largura = sc.nextDouble();
		}
		
		sc.close();

	}

}
