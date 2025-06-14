import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuCambio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> historico = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== CONVERSOR DE MOEDAS ===");
            System.out.println("0  - Sair");
            System.out.println("1  - USD → BRL");
            System.out.println("2  - BRL → USD");
            System.out.println("3  - ARS → BRL");
            System.out.println("4  - BRL → ARS");
            System.out.println("5  - BOB → BRL");
            System.out.println("6  - BRL → BOB");
            System.out.println("7  - CLP → BRL");
            System.out.println("8  - BRL → CLP");
            System.out.println("9  - COP → BRL");
            System.out.println("10 - BRL → COP");
            System.out.println("11 - EUR → BRL");
            System.out.println("12 - GBP → BRL");
            System.out.println("13 - JPY → BRL");
            System.out.println("14 - MXN → BRL");
            System.out.println("15 - Ver histórico");

            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (opcao == 15) {
                System.out.println("\n--- HISTÓRICO DE CONVERSÕES ---");
                if (historico.isEmpty()) {
                    System.out.println("Nenhuma conversão realizada ainda.");
                } else {
                    for (String registro : historico) {
                        System.out.println(registro);
                    }
                }
                continue;
            }

            String moedaBase = "";
            String moedaAlvo = "";

            switch (opcao) {
                case 1: moedaBase = "USD"; moedaAlvo = "BRL"; break;
                case 2: moedaBase = "BRL"; moedaAlvo = "USD"; break;
                case 3: moedaBase = "ARS"; moedaAlvo = "BRL"; break;
                case 4: moedaBase = "BRL"; moedaAlvo = "ARS"; break;
                case 5: moedaBase = "BOB"; moedaAlvo = "BRL"; break;
                case 6: moedaBase = "BRL"; moedaAlvo = "BOB"; break;
                case 7: moedaBase = "CLP"; moedaAlvo = "BRL"; break;
                case 8: moedaBase = "BRL"; moedaAlvo = "CLP"; break;
                case 9: moedaBase = "COP"; moedaAlvo = "BRL"; break;
                case 10: moedaBase = "BRL"; moedaAlvo = "COP"; break;
                case 11: moedaBase = "EUR"; moedaAlvo = "BRL"; break;
                case 12: moedaBase = "GBP"; moedaAlvo = "BRL"; break;
                case 13: moedaBase = "JPY"; moedaAlvo = "BRL"; break;
                case 14: moedaBase = "MXN"; moedaAlvo = "BRL"; break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            try {
                CambioBusca conversao = new CambioBusca(moedaBase, moedaAlvo, valor);
                double convertido = conversao.converterValor(valor, String.valueOf(conversao.taxa));
                String registro = String.format("%.2f %s → %.2f %s", valor, moedaBase, convertido, moedaAlvo);
                historico.add(registro);
            } catch (IOException e) {
                System.out.println("Erro na conversão: " + e.getMessage());
            }

        } while (true);

        scanner.close();
    }
}
