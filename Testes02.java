/*Média menor que 5,0: mensagem “Você está reprovado.”
Média entre 5,0 e 6,9: mensagem “Você está de recuperação.”
Média 7,0 ou mais: mensagem “Parabéns! Você foi aprovado.”
*/


package testesRapidos;
import java.util.Scanner;

public class Testes02 {
	public static void main(String[] args) {
	double soma = 0;
	double nota = 0;
	double media = 0;
	Scanner entrada = new Scanner(System.in);
	int i = 1;
	
	//calculo da media
	while (i <= 4) {
		
		System.out.println("Digite a " + i + "ª nota");
		nota = entrada.nextDouble();
		soma = nota + soma;
		i ++;
		media = (soma / 4);
	}
	
	System.out.println("\nA soma das notas foi: " + soma);
	System.out.println("Sua média é " + media);
	
	//condição do aluno
		if (media >= 7) {
			System.out.println("\nParabéns! Você foi aprovado.");
		} else {
			if (media < 5) {
			System.out.println("\nVocê está reprovado.");
			} else {
			System.out.println("\nVocê está de recuperação.");
		}
	
		}
	}
	
}

