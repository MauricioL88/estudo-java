package colecoes;

import java.util.Arrays;

/**
 * Utilização de array e alguns atribuos como:
 * Declaração de um array;
 * Forma de atribuir valores;
 * Usando o ".length" para retornar o tamanho (comprimento) do array em valor inteiro.
 */

public class MatrizSimples {
    public static void main(String[] args) throws Exception {
        double[] notasAlunosA = new double[3];

        notasAlunosA[0] = 3.5;
        notasAlunosA[1] = 7.5;
        notasAlunosA[2] = 10;

        double totalNotasAlunos = 0;
        for(int i = 0; i < notasAlunosA.length; i++) {
            totalNotasAlunos += notasAlunosA[i];
        }

        System.out.println(Arrays.toString(notasAlunosA)+"\n");

        System.out.println("Média das notas: "+totalNotasAlunos / notasAlunosA.length);
    }
}
