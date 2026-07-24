package br.edu.ifpb.bd.projeto.dao;

import br.edu.ifpb.bd.projeto.model.Aluno;
import br.edu.ifpb.bd.projeto.model.Responsavel;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public List<Aluno> listarTodos() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT a.ID_aluno, a.Nome AS aluno_nome, a.Data_nascimento, " +
                     "r.ID_responsavel, r.Nome AS resp_nome, r.CPF, r.Telefone " +
                     "FROM Aluno a JOIN Responsavel r ON a.ID_responsavel = r.ID_responsavel " +
                     "ORDER BY a.ID_aluno";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Responsavel resp = new Responsavel(
                    rs.getInt("ID_responsavel"),
                    rs.getString("resp_nome"),
                    rs.getString("CPF"),
                    rs.getString("Telefone")
                );
                Aluno aluno = new Aluno(
                    rs.getInt("ID_aluno"),
                    rs.getString("aluno_nome"),
                    rs.getDate("Data_nascimento").toLocalDate(),
                    resp
                );
                alunos.add(aluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public void salvar(Aluno aluno) {
        String sql = "INSERT INTO Aluno (Nome, Data_nascimento, ID_responsavel) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setDate(2, Date.valueOf(aluno.getDataNascimento()));
            stmt.setInt(3, aluno.getResponsavel().getIdResponsavel());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int idAluno) {
        String sql = "DELETE FROM Aluno WHERE ID_aluno = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idAluno);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
