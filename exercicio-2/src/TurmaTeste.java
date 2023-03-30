import java.util.Scanner;

public class TurmaTeste {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in, "CP850");
        Turma turma1 = new Turma("ADS", "POO");

        System.out.print("Digite o nome do curso: ");
        String curso1 = scanner.nextLine();
        turma1.setCurso(curso1);

        System.out.print("Digite o nome da disciplina: ");
        String disciplina1 = scanner.nextLine();
        turma1.setDisciplina(disciplina1);
        
        turma1.imprime();
        scanner.close();
    }
}
