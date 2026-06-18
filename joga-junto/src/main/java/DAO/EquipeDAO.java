package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entidade.Equipe;

public class EquipeDAO {
    private Connection conn;

    public EquipeDAO(Connection conn) { this.conn = conn; }

    public void inserir(Equipe e) throws SQLException {
        String sql = "INSERT INTO equipe (nome, cidade) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, e.getNome());
            stmt.setString(2, e.getCidade());
            stmt.executeUpdate();
        }
    }

    public void remover(int id) throws SQLException {
        String sql = "DELETE FROM equipe WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Equipe removida!");
        }
    }

    public List<Equipe> listar() throws SQLException {
        List<Equipe> lista = new ArrayList<>();
        String sql = "SELECT * FROM equipe";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Equipe(rs.getInt("id"), rs.getString("nome"), rs.getString("cidade"), null));
            }
        }
        return lista;
    }
}
