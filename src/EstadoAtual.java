public class EstadoAtual {
    static private String nome;
    static private Estudante estudante;
    static private Docente docente;
    
    static public String getNome() {
        return nome;
    }
    static public void setNome(String nome) {
        EstadoAtual.nome = nome;
    }
    static public Estudante getEstudante() {
        return estudante;
    }
    static public void setEstudante(Estudante estudante) {
        EstadoAtual.estudante = estudante;
    }
    static public Docente getDocente() {
        return docente;
    }
    static public void setDocente(Docente docente) {
        EstadoAtual.docente = docente;
    }
}
