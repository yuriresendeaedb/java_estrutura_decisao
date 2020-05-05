/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        
        float n1;
        String sexo;
        
        Scanner scannum = new Scanner (System.in);
        Scanner scanstr = new Scanner (System.in);
        
        System.out.print("Digite seu altura: ");
        n1 = scannum.nextFloat();
        System.out.println("A) Feminino \nB) Masculino");
        System.out.print("Qual seu sexo? ");
        sexo = scanstr.nextLine();
        
        while (!("B".equals(sexo)) | ("A".equals(sexo))){
           System.out.print("Digite A ou B: ");
           sexo = scanstr.nextLine();
        }
   
        if ("A".equals(sexo) || "a".equals(sexo)){
            System.out.println("Seu peso ideal é: "+((62.1*n1)-44.7));
        }else if ("B".equals(sexo) || "b".equals(sexo)){
            System.out.println("Seu peso ideal é: "+((71.5*n1)-58));
        }
        
    }
}
