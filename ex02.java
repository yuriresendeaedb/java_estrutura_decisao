/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        int n1, n2;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite um número inteiro: ");
        n1 = scan.nextInt();
        System.out.print("Digite mais um número inteiro: ");
        n2 = scan.nextInt();
        
        if ((n1 + n2) > 10){
            System.out.println("A soma dos dois números é igual a "+(n1+n2));
        }
    }
    
}