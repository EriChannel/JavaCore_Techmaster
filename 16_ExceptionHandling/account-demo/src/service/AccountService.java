package service;

import model.Account;

public interface AccountService {

    boolean addNewAccount(Account account);

    Account login(String email, String password);

    void updatePassword(String email, String password);
}
