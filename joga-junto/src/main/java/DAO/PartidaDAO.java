package DAO;

import java.sql.*;

public class PartidaDAO {
    private Connection conn;

    public PartidaDAO(Connection conn) { this.conn = conn; }

    public void registrarSumula(int idPartida, int golsC, int golsV) throws SQLException {
        String sql = "UPDATE partida SET gols_casa = ?, gols_visitante = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, golsC);
            stmt.setInt(2, golsV);
            stmt.setInt(3, idPartida);
            stmt.executeUpdate();
            System.out.println("✅ Súmula registrada!");
        }
    }
}
