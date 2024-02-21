package colecoes;

import java.util.Scanner;

public class ParaCada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas deseja cadastrar: ");
        int qtd = entrada.nextInt();

        double[] notas = new double[qtd];
        double media = 0.0;
        for(int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota "+(i+1)+" : ");
            notas[i] = entrada.nextDouble();
            media += notas[i];
        }

        double resultado = media / qtd;

        System.out.println("\nNotas digitadas:");
        int i = 0;
        for (double nota : notas) {
            System.out.println("Nota "+(i += 1)+": "+nota);
        }

        System.out.println("\nMedia do aluno: "+resultado);

        entrada.close();
    }
}
