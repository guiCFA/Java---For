import java.util.Scanner;

public class ex7 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		double idade,altura,peso,mediaAltura = 0,mediaPeso = 0, acumuladorAltura = 0;
		int idadeMais = 0, idadeJovem = 0,magro = 0;
		
		for(int pessoas = 0 ; pessoas < 25 ; pessoas++ ) {
			
			System.out.println("Digite os dados da " + (pessoas + 1) + "° pessoa");
			
			System.out.println("Digite a idade");
			idade = teclado.nextDouble();
			
			System.out.println("Digite a altura");
			altura = teclado.nextDouble();
			
			System.out.println("Digite o peso");
			peso = teclado.nextDouble();
						
			if(idade > 50) {
				idadeMais++;
			}
			
			if(idade >= 10 && idade <= 20) {
				idadeJovem++;
				acumuladorAltura = acumuladorAltura + altura;
				mediaAltura = acumuladorAltura / idadeJovem;
			}
			
				
			if(peso < 40) {
				magro++;			
			}
			
			mediaPeso = ((magro * 100) / 25);
		}
		
		
		System.out.println("Pessoas com mais de 50: " + idadeMais);
		System.out.println("A média da altura com pessoas entre 10 e 20 anos é: " + mediaAltura);
		System.out.println("A percentagem com pessoas com o peso inferior a 40 é: " + mediaPeso + "%");
	}
}
