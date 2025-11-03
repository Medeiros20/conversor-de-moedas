import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCambio consulta = new ConsultaCambio();

        while (true) {
            System.out.println("___________________________");
            System.out.println("Conversor de Moedas");
            System.out.println("1 - Dolar (USD) → Real (BRL)");
            System.out.println("2 - Real (BRL) → Dolar (USD)");
            System.out.println("3 - Euro (EUR) → Real (BRL)");
            System.out.println("4 - Real (BRL) → Euro (EUR)");
            System.out.println("5 - Dolar (USD) → Euro (EUR)");
            System.out.println("6 - Euro (EUR) → Dolar (USD)");
            System.out.println("___________________________");
            System.out.print("Escolha uma das opção acima: ");
            int opcao = leitura.nextInt();

            String from = "", to = "";
            switch (opcao) {
                case 1 -> {
                    from = "USD";
                    to = "BRL";
                }
                case 2 -> {
                    from = "BRL";
                    to = "USD";
                }
                case 3 -> {
                    from = "EUR";
                    to = "BRL";
                }
                case 4 -> {
                    from = "BRL";
                    to = "EUR";
                }
                case 5 -> {
                    from = "USD";
                    to = "EUR";
                }
                case 6 -> {
                    from = "EUR";
                    to = "USD";
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
                Moeda resultado = consulta.buscaCambio(from);
                double convertido = valor * resultado.getTaxa(to);
                System.out.printf(" %.2f %s = %.2f %s%n", valor, from, convertido, to);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
