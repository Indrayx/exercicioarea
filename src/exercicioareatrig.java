import java.util.Locale;
import java.util.Scanner;
public class exercicioareatrig {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura,area,perimetro;
		int op�ao;
		area = 0;
		perimetro = 0;		
		System.out.println("Digite a largura do retangulo:");
		largura = sc.nextDouble();
		while(largura <= 0) {
			System.out.println("o valor deve ser positivo.Tente novamente");
			largura = sc.nextDouble();
		}
		System.out.println("Digite a altura do retangulo:");
		altura = sc.nextDouble();
		while(altura <= 0) { 
			System.out.println("o valor deve ser positivo.Tente novamente");
			altura = sc.nextDouble();
		}
		System.out.println("MENU:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - sair");
		System.out.println("Digite uma op��o:");
		
		op�ao = sc.nextInt();
		
		while(op�ao != 3) {
			if (op�ao == 1) {
				area = largura * altura;
		System.out.printf("AREA = %.2f%n", area);
		System.out.println("");
		System.out.println("MENU:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - sair");
		System.out.println("Digite uma op��o:");
		op�ao = sc.nextInt();}
			else if (op�ao == 2) { perimetro = (largura * 2) + (altura * 2) ;
			System.out.printf("PERIMETRO = %.2f%n",perimetro);
			System.out.println("");
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - sair");
			System.out.println("Digite uma op��o:");
			op�ao = sc.nextInt();}
			 
			else{
				System.out.println("OP�AO INVALIDA");
				System.out.println("");
				System.out.println("MENU:");
				System.out.println("1 - Mostrar area");
				System.out.println("2 - Mostrar perimetro");
				System.out.println("3 - sair");
				System.out.println("Digite uma op��o:");
				op�ao = sc.nextInt();
							
				}
		}
				
		
		if(op�ao == 3) {
			System.out.println("FIM DO PROGRAMA!");
		} 
		
		
		sc.close();

	}

}
