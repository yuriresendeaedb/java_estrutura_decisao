/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        int n1;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Didite um número inteiro: ");
        n1 = scan.nextInt();
        
        if (n1 > 20){
            System.out.println("O número digitado foi: "+n1);
        }else{
            System.out.println("O número digitado é mwnor que 20.");
        }
    }
}