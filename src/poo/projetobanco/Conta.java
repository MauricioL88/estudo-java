package poo.projetobanco;

public class Conta {
    // variáveis globais
    final static String AGENCIA_PADRAO = "0001";
    static int contaAutomatica = 1;

    // atributos da classe
    String agencia;
    int conta;
    double saldo;

    // Método construtor
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = Conta.contaAutomatica++;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(this.saldo > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
        }else {
            System.out.println("Valor incompatível com o saldo!\nConta: 000"+ this.conta+" | Saldo: R$ "+ this.saldo);
        }
    }

    public void transferir(Conta conta, double valor) {
        if(this.saldo > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            conta.depositar(valor);
        }else {
            System.out.println("Valor incompatível com o saldo!\nConta: 000"+ this.conta+" | Saldo: R$ "+ this.saldo);
        }
    }

    // Método para simular o extrato
    @Override
    public String toString() {
        System.out.println("Conta Corrente - Agência: "+this.agencia+" | Conta: "+this.conta+" | Saldo: R$ "+this.saldo);     
        return super.toString();
    }
}
