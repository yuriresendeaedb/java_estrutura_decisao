/*
Yuri Resende Corrêa - 20157082
 */
package execicios.condicao;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        
        String s1;
        ///String s2 = "AEDB";
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite a senha: ");
        s1 = scan.nextLine();
        
        while (!s1.equals("AEDB")){
            System.out.print("Senha incorreta, tente novamente: ");
            s1 = scan.nextLine();
        }
        
        if (s1.equals("AEDB")){
            System.out.println("\nAqui está so segredo da AEDB: \n"
                    + "https://encrypted-tbn0.gstatic.com/images?q"
                    + "=tbn%3AANd9GcTVyeCeNjSlh6SHpvlk4V_QxdEPdjqAZPmw8Pg"
                    + "j1bY_oJUy-vv-&usqp=CAU");
        }
    }
}
