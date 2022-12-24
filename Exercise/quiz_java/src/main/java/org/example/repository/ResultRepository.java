package org.example.repository;

import org.example.database.ConnectDatabase;
import org.example.model.ResultTest;
import org.example.model.Type;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultRepository {
//    public static List<ResultTest> listResult = new ArrayList<>();

    public List<ResultTest> getListResult(){
        List<ResultTest> listResult = new ArrayList<>();
        Connection conn = ConnectDatabase.connect();
        String query = "SELECT *\n" +
                "FROM test\n" +
                "WHERE id_account = ?\n" +
                "ORDER BY test_date DESC;";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, AccountRepository.loginAccount.getId());

            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                int numberQuestion = rs.getInt("number_question");
                int correctAnswer = rs.getInt("correct_answer");
                int wrongAnswer = numberQuestion - correctAnswer;
                Timestamp timestamp = rs.getTimestamp("test_date");
                LocalDateTime testDate = timestamp.toLocalDateTime();
                Type type = Type.valueOf(rs.getString("type"));

                ResultTest resultTest = new ResultTest(id, AccountRepository.loginAccount, numberQuestion,
                        correctAnswer, wrongAnswer, testDate, type);

                listResult.add(resultTest);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectDatabase.closeConnect(conn);
        return listResult;
    }


}
