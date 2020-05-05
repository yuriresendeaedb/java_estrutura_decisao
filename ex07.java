/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex07 {
     public static void main(String[] args) {
        
         int n1, n2;
         String nome1, nome2;
         
         Scanner scannome = new Scanner (System.in);
         Scanner scanint = new Scanner (System.in);
         
         System.out.print("Digite o nome da primeira pessoa: ");
         nome1 = scannome.nextLine();
         System.out.print("Digite sua idade: ");
         n1 = scanint.nextInt();
         
         System.out.print("Digite o nome da segunda pessoa: ");
         nome2 = scannome.nextLine();
         System.out.print("Digite sua idade: ");
         n2 = scanint.nextInt();
         
         if (n1 > n2){
             System.out.println(nome1+ " é mais velho(a) que " +nome2);
         }else if (n1 < n2){
              System.out.println(nome2+ " é mais velho(a) que " +nome1);
         }else{
             System.out.println("As duas pessoas tem a mesma idade.");
         }
         
    }
}
