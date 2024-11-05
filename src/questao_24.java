import java.util.Scanner;
public class questao_24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o custo do carro de fabrica do carro:" );
		double custosFabrica =
		
		scanner.nextDouble();
		
		Double percentualDistribuidor = 0.28;
		Double percentualImpostos = 0.45;
		
		Double custoDistribuidor = custosFabrica * percentualDistribuidor;
		Double custoImposto = custosFabrica * percentualImpostos;
		Double custoFinal = custosFabrica + percentualDistribuidor + percentualImpostos;
		
		System.out.printf("O custo final do consumidor é: %.2f%n", custoFinal);
		
		scanner.close();
		
		
		

		

	}

}
