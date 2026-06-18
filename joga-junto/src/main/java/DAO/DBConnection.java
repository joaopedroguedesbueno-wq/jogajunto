package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection instance;
    private Connection connection;

    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    // Construtor PRIVADO conforme a imagem 1
    private DBConnection() {
        try {
            this.connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jogajunto", USER, PASSWORD
            );
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar", e);
        }
    }

    // Lógica do getInstance() conforme a imagem 2 (Double-Checked Locking)
    public static DBConnection getInstance() {
        if (instance == null) { // 1ª verificação (rápida)
            synchronized (DBConnection.class) {
                if (instance == null) { // 2ª verificação (segura)
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

    // Método para retornar a conexão conforme a imagem 1
    public Connection getConnection() {
        return this.connection;
    }
}
