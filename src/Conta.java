public class Conta {
  private String titular;
  private String tipo;
  private int numeroConta;
  private double saldo;

  void setTitular(String titular) {
    this.titular = titular;
  }

  void setTipo(String tipo) {
    this.tipo = tipo;
  }

  void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  void exibeConta() {
    System.out.println("----------------------------");
    System.out.println("Titular: " + titular);
    System.out.println("Tipo: " + tipo);
    System.out.println("Nº Conta: " + numeroConta);
    System.out.println("Saldo: " + saldo);
    System.out.println("----------------------------");
  }

  void depositar(double valor) {
    saldo += valor;
  }

  void sacar(double valor) {
    if (saldo >= valor && valor > 0) {
      saldo -= valor;
    } else {
      System.out.printf("%n%n******************************%n");
      System.out.println("Saldo Insuficiente!");
      System.out.printf("******************************%n%n");

    }
  }

  void exibeSaldo() {
    System.out.printf("%n%n******************************%n");
    System.out.println("Saldo: " + saldo);
    System.out.printf("******************************%n%n");

  }

}
