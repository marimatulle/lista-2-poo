public class Turma {
    private String curso, disciplina;

    public Turma (String curso1, String disciplina1){
        curso = curso1;
        disciplina = disciplina1;
    }

    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso1){
        curso = curso1;
    }

    public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina1){
        disciplina = disciplina1;
    }

    public void imprime(){
        System.out.println("\tCurso:" + getCurso() + "\n \tDisciplina:" + getDisciplina());
    }
}

