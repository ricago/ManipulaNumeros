
package manipulanumerosr;

import static manipulanumerosr.ManipulaNumerosR.ler;


class Credito {

    static void calculaCredito() {
        
        int saldoM;
        System.out.println("Digite o seu saldo médio: ");
        saldoM = ler.nextInt();
        
        if (saldoM < 200)
            System.out.println("Nenhum crédito"); 
        else if(200 < saldoM > 401)
            System.out.println("Crédito é 20% do saldo médio");
        else if(400 < saldoM > 601)
            System.out.println("Crédito é 30% do saldo médio");
        else if(saldoM>601)
            System.out.println("Crédito é 40% do saldo médio");
            
        }
    }
    
