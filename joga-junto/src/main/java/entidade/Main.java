package entidade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import DAO.DBConnection;
import DAO.EquipeDAO;
import DAO.PartidaDAO;
import DAO.CompeticaoDAO;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
       
        Connection conn = DBConnection.getInstance().getConnection();

        try {
            if (conn == null || conn.isClosed()) {
                System.err.println("Erro crítico: Não foi possível conectar ao banco.");
                return;
            }

            
            EquipeDAO equipeDAO = new EquipeDAO(conn);
            PartidaDAO partidaDAO = new PartidaDAO(conn);
            CompeticaoDAO competicaoDAO = new CompeticaoDAO(conn);

            int opcao = -1;

            while (opcao != 0) {
                System.out.println("\n======= JOGA JUNTO - SISTEMA =======");
                System.out.println("1 - Cadastrar Clube       2 - Listar Clubes");
                System.out.println("3 - Remover Clube         4 - Criar Competição");
                System.out.println("5 - Adicionar Time em Competição");
                System.out.println("6 - Cadastrar Partida      7 - Registrar Súmula");
                System.out.print("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = leitor.nextInt();
                leitor.nextLine(); // Limpa buffer do teclado

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do Clube: "); String nome = leitor.nextLine();
                        System.out.print("Cidade: "); String cidade = leitor.nextLine();
                        equipeDAO.inserir(new Equipe(nome, cidade));
                        System.out.println("✅ Clube cadastrado!");
                        break;

                    case 2:
                        System.out.println("\n--- LISTA DE CLUBES ---");
                        equipeDAO.listar().forEach(e -> 
                            System.out.printf("ID: %d | %s (%s)%n", e.getId(), e.getNome(), e.getCidade()));
                        break;

                    case 3:
                        System.out.print("Informe o ID do clube para remover: ");
                        int idRemover = leitor.nextInt();
                        equipeDAO.remover(idRemover);
                        break;

                    case 4:
                        System.out.print("Nome da Competição: ");
                        String nomeComp = leitor.nextLine();
                        Competicao novaComp = new Competicao();
                        novaComp.setNome(nomeComp);
                        competicaoDAO.inserir(novaComp);
                        break;

                    case 5:
                        System.out.print("ID da Competição: "); int idC = leitor.nextInt();
                        System.out.print("ID do Clube: "); int idE = leitor.nextInt();
                        competicaoDAO.adicionarClube(idC, idE);
                        break;

                    case 6:
                        Partida partida = new Partida();

                        System.out.print("Rodada: ");
                        partida.setRodada(leitor.nextInt());
                        leitor.nextLine();

                        System.out.print("Data (AAAA-MM-DD): ");
                        partida.setData(leitor.nextLine());

                        System.out.print("Horário (HH:MM): ");
                        partida.setHorario(leitor.nextLine());

                        System.out.print("Local: ");
                        partida.setLocal(leitor.nextLine());

                        System.out.print("ID da Equipe Casa: ");
                        int idEquipe1 = leitor.nextInt();

                        System.out.print("ID da Equipe Visitante: ");
                        int idEquipe2 = leitor.nextInt();

                        System.out.print("ID da Competição: ");
                        int idCompeticao = leitor.nextInt();
                        leitor.nextLine();

                        // Cria objetos apenas com os IDs
                        Equipe equipe1 = new Equipe();
                        equipe1.setId(idEquipe1);

                        Equipe equipe2 = new Equipe();
                        equipe2.setId(idEquipe2);

                        Competicao competicao = new Competicao();
                        competicao.setId(idCompeticao);

                        partida.setEquipe1(equipe1);
                        partida.setEquipe2(equipe2);
                        partida.setCompeticao(competicao);

                        partida.setGolsCasa(0);
                        partida.setGolsVisitante(0);

                        partidaDAO.inserir(partida);

                        System.out.println("✅ Partida cadastrada com sucesso!");
                        break;

                    case 7:
                        System.out.print("ID da Partida: ");
                        int idP = leitor.nextInt();

                        System.out.print("Gols Casa: ");
                        int gc = leitor.nextInt();

                        System.out.print("Gols Visitante: ");
                        int gv = leitor.nextInt();

                        partidaDAO.registrarSumula(idP, gc, gv);
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro no Banco de Dados: " + e.getMessage());
        } finally {
            leitor.close();
        }
    }
}
