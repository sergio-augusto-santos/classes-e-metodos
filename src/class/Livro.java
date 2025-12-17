package livros;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;

        void abrir() {
            System.out.println("O livro está aberto.");
        }
    
        void fechar() {
            System.out.println("O livro está fechado.");
        }
    
        void ler() {
            System.out.println("Lendo o livro: " + titulo);
        }
    }
