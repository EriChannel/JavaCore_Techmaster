package service;

import model.Account;

public interface AccountService {

    Account checkLogin(String email, String password);

    boolean addNewAccount(Account account);

    void updatePassword(String email, String newPassword);
}
