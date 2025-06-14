import java.io.IOException;
import java.util.Scanner;

public class MenuCambio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n=== CONVERSOR DE MOEDAS ===");
            System.out.println("1 - USD (Dólar) → BRL (Real)");
            System.out.println("2 - BRL (Real) → USD (Dólar)");
            System.out.println("3 - ARS (Peso argentino) → BRL (Real)");
            System.out.println("4 - BRL (Real) → ARS (Peso argentino)");
            System.out.println("5 - BOB (Boliviano) → BRL (Real)");
            System.out.println("6 - BRL (Real) → BOB (Boliviano)");
            System.out.println("7 - CLP (Peso chileno) → BRL (Real)");
            System.out.println("8 - BRL (Real) → CLP (Peso chileno)");
            System.out.println("9 - COP (Peso colombiano) → BRL (Real)");
            System.out.println("10 - BRL (Real) → COP (Peso colombiano)");
            System.out.println("11 - sair");
            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            if (opcao == 11) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

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
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            try {
                new CambioBusca(moedaBase, moedaAlvo, valor);
            } catch (IOException e) {
                System.out.println("Erro ao realizar a conversão: " + e.getMessage());
            }

        } while (true);

        scanner.close();
    }
}
