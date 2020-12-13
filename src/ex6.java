import java.util.Scanner;

public class ex6 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int nota1,nota2,notaTotal,reprovado = 0,exame = 0,aprovado = 0,mediaTotalSala = 0;
		
		for(int contador = 0 ; contador < 5 ; contador++) {
			
			System.out.println("Digite as notas do " + (contador + 1) + "° aluno");
			
			System.out.println("Digite a nota 1");
			nota1 = teclado.nextInt();
			
			System.out.println("Digite a nota 2");
			nota2 = teclado.nextInt();
			
			notaTotal = (nota1 + nota2) / 2;
			
			if(notaTotal <= 3) {
				reprovado++;
				System.out.println("O aluno " + (contador + 1) + " está REPROVADO");
			} 
			
			if(notaTotal >= 4 && notaTotal <= 6) {
				exame++;
				System.out.println("O aluno " + (contador + 1) + " está em EXAME");
			} 
				
			if(notaTotal >= 7) {
				aprovado++;
				System.out.println("O aluno " + (contador + 1) + " está APROVADO");
			}
	
			
			mediaTotalSala = mediaTotalSala + notaTotal;		
		
		}
		
		
		System.out.println("O total de Alunos aprovados é " + aprovado);
		System.out.println("O total de Alunos em exame é " + exame);
		System.out.println("O total de Alunos reprovados é " + reprovado);
		System.out.println("A media da sala é " + mediaTotalSala / 5);
	}
}
