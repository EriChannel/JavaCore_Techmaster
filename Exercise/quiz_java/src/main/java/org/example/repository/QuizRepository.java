package org.example.repository;

import org.example.database.ConnectDatabase;
import org.example.model.Answers;
import org.example.model.Quiz;
import org.example.model.Type;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class QuizRepository {

    public static List<Quiz> listQuiz = new ArrayList<>();

    static  {
        String query = "SELECT q.id, q.content as question , id_question, a.content as answer, is_true, comment, type\n" +
                "FROM question q INNER JOIN answers a \n" +
                "ON q.id = a.id_question\n" +
                "ORDER BY id_question ASC";
        Connection conn = ConnectDatabase.connect();
        List<Answers> listAnswers = new ArrayList<>();


        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String question = rs.getString("question");
                int idQuestion = rs.getInt("id_question");
                String answer = rs.getString("answer");
                boolean isTrue = rs.getBoolean("is_true");

                String explain = rs.getString("comment");
                Type type = Type.valueOf(rs.getString("type"));

                if (id == idQuestion) {
                    listAnswers.add(new Answers(answer, isTrue));
                }
                if (listAnswers.size() == 4) {
                    listQuiz.add(new Quiz(id, question, listAnswers, explain, type));
                    listAnswers = new ArrayList<>();
                }


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
