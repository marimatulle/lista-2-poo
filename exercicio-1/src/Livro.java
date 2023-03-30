public class Livro {
    private String titulo, autor;
    
    
    public Livro (String titulo1, String autor1){
        titulo = titulo1;
        autor = autor1;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo1){
        titulo = titulo1;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor1){
        autor = autor1;
    }
    
    public void imprime(){
        System.out.println("\tTitulo do livro:"  + getTitulo() + "\n \tAutor:" + getAutor());
    }
 }
