package DAO;

import java.sql.SQLException;
import java.util.List;
import entidade.Equipe;

public interface CompeticaoDAOInterface {

    void inserir(Equipe equipe) throws SQLException;

    List<Equipe> listar() throws SQLException;

    Equipe buscarPorId(int id) throws SQLException;

    void atualizar(Equipe equipe) throws SQLException;

    void deletar(int id) throws SQLException;
}