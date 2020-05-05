/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        
        float n1, des45, des30;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite o valor do produto: ");
        n1 = scan.nextInt();
        
        if (n1 < 20){
            des45 = (45*n1)/100;
            System.out.println("O valor com 45% de lucro é de: R$"
                    +(des45+n1));
        }else{
            des30 = (30*n1)/100;
            System.out.println("O valor com 30% de lucro é de: R$"
                    +(des30+n1));
        }
    }
}
