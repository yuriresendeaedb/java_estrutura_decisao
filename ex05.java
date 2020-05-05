/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        int n1;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite um número inteiro: ");
        n1 = scan.nextInt();
        
        if ((n1%2)==0){
            System.out.println("O número digitado é PAR.");
        }else{
            System.out.println("O número digitado é ÍMPAR.");
        }
    }
}
