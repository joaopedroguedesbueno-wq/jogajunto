package entidade;

public class Competicao {
    private int id;
    private String nome;

    public Competicao() {
    }

    public Competicao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // O método que o seu Main está procurando é este aqui:
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
