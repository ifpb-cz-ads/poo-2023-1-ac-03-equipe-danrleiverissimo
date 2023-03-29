public class BMexercicio3 {
    public static void main(String[] args) {
        float itemVenda1 = 2.95f;
        float itemVenda2 = 3.50f;
        System.out.println("O item 1 custa " + itemVenda1 + " e o item 2 custa " + itemVenda2);
        
        float custoTotal = itemVenda1 + itemVenda2;
        System.out.println("o custo total dos itens: " + custoTotal);
        
        float taxaCalculada = .0825f * custoTotal;
        System.out.println("o valor da taxa calculada: " + taxaCalculada);
        
        itemVenda1 += taxaCalculada;
        itemVenda2 += taxaCalculada;
        float novoCusto = itemVenda1 + itemVenda2;
        System.out.println("o valor do novo custo: " + novoCusto);
        
        boolean muitoCaro = (novoCusto > 10);
        System.out.println("valor em muitoCaro: " + muitoCaro);
    }
}
/* OUTPUT
O item 1 custa 2.95 e o item 2 custa 3.5
o custo total dos itens: 6.45
o valor da taxa calculada: 0.532125
o valor do novo custo: 7.51425
valor em muitoCaro: false
*/
