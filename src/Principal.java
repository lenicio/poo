import java.util.Random;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String menu;
    int opcao;
    double valor;
    Conta conta1 = new Conta();
    Random r = new Random();

    System.out.print("Informe o nome do titular: ");
    conta1.setTitular(sc.nextLine());

    System.out.print("""
        1. Conta Corrente
        2. Conta Poupança
        """);
    opcao = sc.nextInt();
    switch (opcao) {
      case 1:
        conta1.setTipo("Conta Corrente");
        break;

      case 2:
        conta1.setTipo("Conta Poupança");
        break;
    }

    conta1.setNumeroConta(r.nextInt(10000, 99999));

    conta1.exibeConta();

    menu = """
        1. Sacar
        2. Depositar
        3. Ver Saldo
        4. Sair
        """;

    do {
      System.out.println(menu);
      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Insira o valor do Saque: ");
          valor = sc.nextDouble();
          conta1.sacar(valor);
          break;

        case 2:
          System.out.print("Insira o valor do Depósito: ");
          valor = sc.nextDouble();
          conta1.depositar(valor);
          break;

        case 3:
          conta1.exibeSaldo();
          break;
      }

    } while (opcao != 4);

  }
}
