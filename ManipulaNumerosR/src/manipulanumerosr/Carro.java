
package manipulanumerosr;

import static manipulanumerosr.ManipulaNumerosR.ler;

class Carro {

    static void calculaValorFinal() {
        int op;
        System.out.println("Digite o preço do carro: ");
        op = ler.nextInt();
        double precoF = op - ((op * 0.28) + (op * 0.45));
        System.out.println("O custo de fabrica do carro é " + precoF);
    }
    
}

