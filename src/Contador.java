import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo numeor tem que ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// Validar se parametroUm é menor ou igual a parametroDois
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();

		int i = 0;
		int contagem = parametroDois - parametroUm;
        
        
        // Imprimir os números de parametroUm até o resultado do metodo subtrair
        for (i = 0; i <= contagem; i++) {
                System.out.println(i);
            
        } 		
    }
	

}