package desafios;

import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int casos = input.nextInt();
        int cont = 0;
        double[] mediap = new double[casos];
        while (cont < casos){
 
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
	
	        double peso1 = a * 2.0;
	        double peso2 = b * 3.0;
	        double peso3 = c * 5.0;

            mediap[cont] = (peso1 + peso2 + peso3) / 10;
              
            cont++;
        }

        for (double media : mediap) {
            System.out.printf("\n%.1f\n",media);
        }

        input.close();
    }
}
