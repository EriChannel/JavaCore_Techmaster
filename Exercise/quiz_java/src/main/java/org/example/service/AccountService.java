package org.example.service;

import org.example.model.Account;

public interface AccountService {

    Account loginAccount(String username, String password);
    boolean createAccount(Account account);

    void updatePassword(Account account, String password);
}

