public class Carro {
    // Atributos
    String modelo;
    String cor;
    double potencia;
    int ano;
    boolean alarmeDeFabrica, statusMotor = false;

    // Métodos
    void ligarCarro() {
        if (statusMotor) {
            System.out.println("O carro já está ligado!");
        } else {
            statusMotor = true;
        }
    }

    void desligarCarro() {
        if (statusMotor) {
            statusMotor = false;
        } else {
            System.out.println("O carro já está desligado!");
        }
    }

    void statusDoCarro() {
        if (statusMotor) {
            System.out.println("O carro está ligado!");
        } else {
            System.out.println("O carro está desligado!");
        }
    }


}
