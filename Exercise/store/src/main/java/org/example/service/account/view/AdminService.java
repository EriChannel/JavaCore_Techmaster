package org.example.service.account.view;

import org.example.model.account.Account;

public interface AdminService {
    boolean addNewAccount(Account account);

    Account getAccountById(int id);
}
