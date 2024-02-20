package poo.inteface;

public class Calculadora implements OperacaoesMatematicas {
    
    @Override
    public void somar(double num1, double num2) {
        System.out.println("O resultado da soma é: "+(num1 + num2));
    }
    
    @Override
    public void subtrair(double num1, double num2) {
        System.out.println("O resultado da subtração é: "+(num1 - num2));
    }
    
    @Override
    public void multiplicar(double num1, double num2) {
        System.out.println("O resultado da multiplicação é: "+(num1 * num2));
    }
    
    @Override
    public void dividir(double num1, double num2) {
        System.out.println("O resultado da divisão é: "+(num1 / num2));
    }
}
