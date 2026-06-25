package DAO;

import entidade.Partida;
import java.sql.*;

public class PartidaDAO {

    private Connection conn;

    public PartidaDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Partida partida) throws SQLException {

    	String sql =
    	        "INSERT INTO partida " +
    	        "(rodada, data, horario, local, " +
    	        "equipe1_id, equipe2_id, competicao_id, " +
    	        "gols_casa, gols_visitante) " +
    	        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, partida.getRodada());
            stmt.setDate(2, Date.valueOf(partida.getData()));
            stmt.setTime(3, Time.valueOf(partida.getHorario() + ":00"));
            stmt.setString(4, partida.getLocal());

            stmt.setInt(5, partida.getEquipe1().getId());
            stmt.setInt(6, partida.getEquipe2().getId());
            stmt.setInt(7, partida.getCompeticao().getId());

            stmt.setInt(8, partida.getGolsCasa());
            stmt.setInt(9, partida.getGolsVisitante());

            stmt.executeUpdate();

            System.out.println("✅ Partida cadastrada com sucesso!");
        }
    }

    public void registrarSumula(int idPartida, int golsC, int golsV) throws SQLException {

    	String sql =
    	        "UPDATE partida " +
    	        "SET gols_casa = ?, gols_visitante = ? " +
    	        "WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, golsC);
            stmt.setInt(2, golsV);
            stmt.setInt(3, idPartida);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("✅ Súmula registrada!");
            } else {
                System.out.println("❌ Partida não encontrada.");
            }
        }
    }
}