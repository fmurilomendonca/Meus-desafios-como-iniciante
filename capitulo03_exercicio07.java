/*Faça um programa que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso, se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.
*/

package exercicio;
import java.util.Scanner;

public class capitulo03_exercicio07 {
	public static void main(String[] args) {
	
	int opcao = 0;
	String menu = """
			Emagreceu digite 01
			Engordou digite  02
				  """;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite seu peso ");
	double peso = entrada.nextDouble();
	System.out.println(menu);
	int resultado = entrada.nextInt();	
				
	switch (opcao) ;
	
	
		//if (resultado = "s") {
		peso = peso + (peso * 0.15);
		System.out.println("Você engordou e seu novo peso é " + peso);
	
		
	}
}

