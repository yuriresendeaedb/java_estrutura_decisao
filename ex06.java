/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        
        int n1, n2, n3;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite a primeira nota: ");
        n1 = scan.nextInt();
        while (n1 > 2){
            System.out.print("O valor máximo da prova é 2, digite o valor "
                    + "correto: ");
            n1 = scan.nextInt();
        }
        System.out.print("Digite a segunda nota: ");
        n2 = scan.nextInt();
        while (n2 > 3){
            System.out.print("O valor máximo da prova é 3, digite o valor"
                    + " correto: ");
            n2 = scan.nextInt();
        }
        System.out.print("Digite a terceira nota: ");
        n3 = scan.nextInt();
        while (n3 > 5){
            System.out.print("O valor máximo da prova é 5, digite o valor"
                    + " correto: ");
            n3 = scan.nextInt();
        }
        if ((n1+n2+n3)>= 7){
            System.out.println("Média igual a " +(n1+n2+n3)+ ". Aluno APROVADO!");
        }else{
            System.out.println("Média igual a " +(n1+n2+n3)+ ". Aluno REPROVADO!");
        }
    }
}
