import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			int num1 = scanner.nextInt();

			System.out.print("Digite o segundo número: ");
			int num2 = scanner.nextInt();

			if (num1 > num2) {
			    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}

			for (int i = num1; i <= num2; i++) {
			    System.out.println("Imprimindo o número " + i);
			}

			System.out.println("Digite um número para verificar se ele está no intervalo: ");
			int num3 = scanner.nextInt();

			if (num3 >= num1 && num3 <= num2) {
			    System.out.println("O número " + num3 + " está no intervalo entre " + num1 + " e " + num2);
			} else {
			    System.out.println("O número " + num3 + " não está no intervalo entre " + num1 + " e " + num2);
			}
			
		}
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

