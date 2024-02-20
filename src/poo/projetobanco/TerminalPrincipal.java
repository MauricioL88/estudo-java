package poo.projetobanco;

import java.time.LocalDateTime;

public class TerminalPrincipal {
    public static void main(String[] args) {
        ContaRendimento conta1 = new ContaRendimento();

        conta1.depositar(100.0);
        conta1.toString();
        System.out.println();
        
        conta1.saldoRender(50.0);
        conta1.toString();
        System.out.println();
        conta1.extratoRnd();
        System.out.println();

        double projRend = conta1.rentabilidade(30);
        System.out.printf("Projeção de Rendimento para 30 dias: R$ %.2f reais.\n",projRend);
        
        projRend = conta1.rentabilidade(60);
        System.out.printf("Projeção de Rendimento para 60 dias: R$ %.2f reais.\n",projRend);
        
        projRend = conta1.rentabilidade(90);
        System.out.printf("Projeção de Rendimento para 90 dias: R$ %.2f reais.\n",projRend);
        
        projRend = conta1.rentabilidade(360);
        System.out.printf("Projeção de Rendimento para 360 dias: R$ %.2f reais.\n",projRend);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
