
package manipulanumerosr;

import static manipulanumerosr.ManipulaNumerosR.ler;

class Carro {

    static void calculaValorFinal() {
        float i;
        float d;
        int op;
        
        float precoD;
        float precoI;
        System.out.println("Digite o preço do carro: ");
        op = ler.nextInt();
        d = (float) 0.28;
        i = (float) 0.45;
        
        precoD = op * d;
        precoI = op * i;
        float precoF = op - (precoD + precoI);
        System.out.println("O custo de fabrica do carro é " + precoF);
    }
    
}

