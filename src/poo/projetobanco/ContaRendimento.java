package poo.projetobanco;

public class ContaRendimento extends Conta {

    public static double txRendAno = 0.13;
    public static double txRendMes = txRendAno / 12;
    public static double txRendDia = txRendMes / 30;

    public double saldoRend = 0.0;

    public void saldoRender(double valor) {
        if(super.saldo > 0.0 && valor <= super.saldo) {
            super.saldo -= valor;
            this.saldoRend += valor;
        }
    }

    public void extratoRnd() {
        System.out.println("Saldo Rendimento: R$ "+this.saldoRend);
    }

    public double rentabilidade(int perDia) {
        double valor = 0.0;
        for(int i = 1; i <= perDia; i++) {
            valor += (this.saldo * txRendDia);
        }
        valor += this.saldo;
        return valor;
    }
}
