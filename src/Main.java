import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCambio consulta = new ConsultaCambio();

        while (true) {
            System.out.println("___________________________");
            System.out.println("Conversor moedaDeOrigem Moedas");
            System.out.println("1 - Dolar (USD) → Real (BRL)");
            System.out.println("2 - Real (BRL) → Dolar (USD)");
            System.out.println("3 - Euro (EUR) → Real (BRL)");
            System.out.println("4 - Real (BRL) → Euro (EUR)");
            System.out.println("5 - Dolar (USD) → Euro (EUR)");
            System.out.println("6 - Euro (EUR) → Dolar (USD)");
            System.out.println("___________________________");
            System.out.print("Escolha uma das opção acima: ");
            int opcao = leitura.nextInt();

            String moedaDeOrigem = "", moedaDeConversao = "";
            switch (opcao) {
                case 1 -> {
                    moedaDeOrigem = "USD";
                    moedaDeConversao = "BRL";
                }
                case 2 -> {
                    moedaDeOrigem = "BRL";
                    moedaDeConversao = "USD";
                }
                case 3 -> {
                    moedaDeOrigem = "EUR";
                    moedaDeConversao = "BRL";
                }
                case 4 -> {
                    moedaDeOrigem = "BRL";
                    moedaDeConversao = "EUR";
                }
                case 5 -> {
                    moedaDeOrigem = "USD";
                    moedaDeConversao = "EUR";
                }
                case 6 -> {
                    moedaDeOrigem = "EUR";
                    moedaDeConversao = "USD";
                }
                default -> {
                    System.out.println("Opção inválida!");
                    leitura.close();
                    return;
                }
            }

            System.out.print("Digite o valor: ");
            double valor = leitura.nextDouble();
            try {
                Moeda resultado = consulta.buscaCambio(moedaDeOrigem);
                double convertido = valor * resultado.getTaxa(moedaDeConversao);
                System.out.printf(" %.2f %s = %.2f %s%n", valor, moedaDeOrigem, convertido, moedaDeConversao);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
