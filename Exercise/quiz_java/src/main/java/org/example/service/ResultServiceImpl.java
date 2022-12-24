package org.example.service;

import org.example.database.ConnectDatabase;
import org.example.model.ResultTest;
import org.example.model.Type;
import org.example.repository.AccountRepository;
import org.example.repository.ResultRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class ResultServiceImpl implements ResultService {

    ResultRepository resultRepository;

    public ResultServiceImpl() {
        resultRepository = new ResultRepository();
    }

    @Override
    public List<ResultTest> getAllResultTests(){
        return resultRepository.getListResult();
    }

    @Override
    public void addNewResult(ResultTest result){
        Connection conn = ConnectDatabase.connect();
        String query = "INSERT INTO test (id_account, number_question, correct_answer, type)\n" +
                "VALUES (?, ? , ?, ?);";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, AccountRepository.loginAccount.getId());
            pstm.setInt(2, result.getNumberQuestion());
            pstm.setInt(3, result.getCorrectAnswer());
            pstm.setString(4, result.getType().toString());

            pstm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectDatabase.closeConnect(conn);
    }

    @Override
    public List<ResultTest> getListResultTestByLevel(Type type){
        return resultRepository.getListResult().stream().filter(rs -> rs.getType() == type)
                .collect(Collectors.toList());
    }
}
