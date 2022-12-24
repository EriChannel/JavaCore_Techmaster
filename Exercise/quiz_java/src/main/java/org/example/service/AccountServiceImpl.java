package org.example.service;

import org.example.database.ConnectDatabase;
import org.example.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountServiceImpl implements AccountService {

   @Override
    public Account loginAccount(String username, String password){
        Account account = null;

        Connection conn = ConnectDatabase.connect();
        String query = "SELECT id, user_name, password\n" +
                "FROM account\n" +
                "WHERE user_name = ? \n" +
                "AND password = ?;";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);

            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");

                account = new Account(id, username, password);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectDatabase.closeConnect(conn);

        return account;
    }

    @Override
    public boolean createAccount(Account account){
        boolean isInsert = false;
        Connection conn = ConnectDatabase.connect();
        String query = "INSERT INTO account(user_name, password)\n" +
                "VALUES (?, ?);";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, account.getUsername());
            pstm.setString(2, account.getPassword());

            int row = pstm.executeUpdate();
            if(row == 1){
                isInsert = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isInsert;
    }


    @Override
    public void updatePassword(Account account, String password) {
        Connection conn = ConnectDatabase.connect();
        String query = "UPDATE account\n" +
                "SET password = ?\n" +
                "WHERE id = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, password);
            pstm.setInt(2, account.getId());

            pstm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectDatabase.closeConnect(conn);
    }
}
