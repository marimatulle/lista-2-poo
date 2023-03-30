public class UsaFatura {
    public static void main(String[] args) throws Exception {
        Fatura fatura = new Fatura("007", "Monitor curvado", 3, 2000.00);

        System.out.println("Número da fatura: " + fatura.getNumero());
        System.out.println("Descrição da fatura: " + fatura.getDescricao());
        System.out.println("Quantidade comprada: " + fatura.getQuantidade());
        System.out.println("Preço por unidade: " + fatura.getPreco());
        System.out.println("Preço total: " + fatura.getQtdeFatura());
    }
}
