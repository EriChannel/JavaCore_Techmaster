package org.example.service.account.view;

import org.example.model.account.Account;

public interface AccountService {

    Account checkLogin(String mobile, String password);

    void updatePassword(Account account, String newPassword);

}
