public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }
}
