package org.example.repository;

import org.example.database.ConnectDatabase;
import org.example.model.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public static Account loginAccount = null;

    public static List<Account> allAccount = new ArrayList<>();
   public static void updateListAccount() {
        Connection conn = ConnectDatabase.connect();

        String query = "SELECT id, user_name, password\n" +
                "FROM account;";

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("user_name");
                String password = rs.getString("password");

                Account account = new Account(id, username, password);
                allAccount.add(account);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectDatabase.closeConnect(conn);
    }
}
