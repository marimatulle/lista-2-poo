import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in, "CP850");
        Livro livro1 = new Livro( "Java como programar", "Deitel");

        System.out.print("Digite o título do livro: ");
        String titulo1 = scanner.nextLine();
        livro1.setTitulo(titulo1);

        System.out.print("Digite o nome do autor(a): ");
        String autor1 = scanner.nextLine();
        livro1.setAutor(autor1);

        livro1.imprime();
        scanner.close();
    }
}
