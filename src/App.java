public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Livro livro1 = new Livro();
        livro1.titulo = "Dom Quixote";
        livro1.autor = "Miguel de Cervantes";
        livro1.numeroDePaginas = 900;
        livro1.abrir();
        livro1.ler();
        livro1.fechar();

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";    
        carro1.modelo = "Corolla";
        carro1.ano = 2020;  
        carro1.ligar();
        carro1.acelerar();
        carro1.desligar();

        ContaBancaria conta1 = new ContaBancaria("João Silva", "12345-6", 1000.0);
        conta1.depositar(500.0);
    }
}

// Definição da classe Livro
class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;

    void abrir() {
        System.out.println("Livro aberto: " + titulo);
    }

    void ler() {
        System.out.println("Lendo: " + titulo);
    }

    void fechar() {
        System.out.println("Livro fechado: " + titulo);
    }
}

// Definição da classe Carro
class Carro {
    String marca;
    String modelo;
    int ano;

    void ligar() {
        System.out.println("Carro ligado: " + modelo);
    }

    void acelerar() {
        System.out.println("Acelerando: " + modelo);
    }

    void desligar() {
        System.out.println("Carro desligado: " + modelo);
    }
}

class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}