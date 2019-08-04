
package condicoeslaranja;

import java.util.Scanner;


public class CondicoesLaranja {

    
    public static void main(String[] args) {
        
       /* As laranjas custam R$ 1,10 cada se
forem compradas menos de uma dúzia,
e R$ 0,75 se forem compradas pelo
menos 12. Escreva um programama que
leia o número de laranjas compradas,
calcule e escreva o custo da compra. */

Scanner leia = new Scanner (System.in);
       System.out.println ("Informe um número");
       
       int numero = leia.nextInt();
       
       if (numero >= 12) {
           System.out.println (0.75 * numero);
       } else {
           System.out.println(1.10 * numero);
       }
    }
    
}
