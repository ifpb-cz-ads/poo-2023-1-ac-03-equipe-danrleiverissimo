class Q04_CBB{
    public static void main(String args[]){
        // Inicializa as dimensões da piscina em metros
        double base = 5.0;
        double altura = 2.0;
        double comprimento = 10.0;
        // Calcula a cubagem da piscina
        double volumePiscina = base * altura * comprimento;
        // Calcula o valor total do orçamento
        double precoMetroCubico = 100.00;
        double orcamento = volumePiscina * precoMetroCubico;
        // Imprime o valor total do orçamento na tela
        System.out.printf("O valor total do orçamento é R$%.2f", orcamento);
    }
}