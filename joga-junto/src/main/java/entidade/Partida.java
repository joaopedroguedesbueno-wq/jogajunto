package entidade;

public class Partida {

    private int id;
    private int rodada;
    private String data;
    private String horario;
    private String local;
    private Equipe equipe1;
    private Equipe equipe2;
    private Competicao competicao;
    private int golsCasa;
    private int golsVisitante;

    public Partida() {
    }

    public Partida(int id, int rodada, String data, String horario, String local,
                   Equipe equipe1, Equipe equipe2, Competicao competicao,
                   int golsCasa, int golsVisitante) {
        this.id = id;
        this.rodada = rodada;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.competicao = competicao;
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { 
        this.id = id;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) { 
        this.rodada = rodada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public void setGolsCasa(int golsCasa) {
        this.golsCasa = golsCasa;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }
}