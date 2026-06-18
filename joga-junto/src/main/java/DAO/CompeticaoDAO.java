package DAO;

import java.sql.*;
import entidade.Competicao;

public class CompeticaoDAO {
    private Connection conn;

    public CompeticaoDAO(Connection conn) { 
        this.conn = conn; 
    }

    public void inserir(Competicao comp) throws SQLException {
        String sql = "INSERT INTO competicao (nome) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, comp.getNome());
            stmt.executeUpdate();
            System.out.println("✅ Competição criada!");
        }
    }

    // ADICIONE ESTE MÉTODO ABAIXO:
    public void adicionarClube(int idCompeticao, int idEquipe) throws SQLException {
        String sql = "INSERT INTO competicao_equipe (competicao_id, equipe_id) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCompeticao);
            stmt.setInt(2, idEquipe);
            stmt.executeUpdate();
            System.out.println("✅ Clube vinculado à competição!");
        }
    }
}
