package desafios;

import java.util.Scanner;

public class ProibidoMenores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] idade = new int[N];

        for (int i = 0; i < N; i++) {
            idade[i] = scan.nextInt();
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++) {
            if (idade[i] < 18) {
                System.out.println(idade[i]);
            }

        }
        scan.close();
    }
}
