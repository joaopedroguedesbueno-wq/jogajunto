package entidade;

public class Equipe {

    private int id;
    private String nome;
    private String cidade;
    private String escudo;

    
    public Equipe() {
    }

    
    public Equipe(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    
    public Equipe(int id, String nome, String cidade, String escudo) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.escudo = escudo;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEscudo() { return escudo; }
    public void setEscudo(String escudo) { this.escudo = escudo; }
}