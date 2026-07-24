package br.edu.ifpb.bd.projeto.dao;

import br.edu.ifpb.bd.projeto.model.Responsavel;
import br.edu.ifpb.bd.projeto.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResponsavelDAO {

    public List<Responsavel> listarTodos() {
        List<Responsavel> responsaveis = new ArrayList<>();
        String sql = "SELECT * FROM Responsavel ORDER BY ID_responsavel";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Responsavel resp = new Responsavel(
                    rs.getInt("ID_responsavel"),
                    rs.getString("Nome"),
                    rs.getString("CPF"),
                    rs.getString("Telefone")
                );
                responsaveis.add(resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return responsaveis;
    }
}
