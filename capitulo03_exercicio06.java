/* Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa
que receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu
salário final.
*/

package exercicio;
import java.util.Scanner;


public class capitulo03_exercicio06 {
	
	public static void main(String[] args) {
	int salario;
	int vendas;
	float perc_comissao;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Qual o valor do salário: ");
	salario = entrada.nextInt();
	System.out.println("Qual o valor das vendas: ");
	vendas = entrada.nextInt();
	System.out.println("Qual o percentual de ganho sobre as vendas: ");
	perc_comissao = entrada.nextFloat();
	
	System.out.println("========================");
	System.out.println("O valor da comissão é " + (vendas * (perc_comissao/100)));
	System.out.println("O novo salário é R$ " + (salario+(vendas * (perc_comissao/100))));
	}
}
