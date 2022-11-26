package org.example.service.account;

import org.example.model.account.Account;
import org.example.repository.AccountRepository;
import org.example.service.account.view.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    public List<Account> getAllAccounts(){
        return AccountRepository.accountList;
    }
    @Override
    public Account checkLogin(String mobile, String password) {
        for(Account account: getAllAccounts()){
            if(mobile.equals(account.getMobile())){
                if(password.equals(account.getPassword())){
                    return account;
                }
            }
        }
        return null;
    }

    public boolean addNewAccount(Account account) {
        return getAllAccounts().add(account);
    }

    public Account getAccountByMobile(String mobile){
        for(Account account: getAllAccounts()){
            if(account.getMobile().equals(mobile)){
                return account;
            }
        }

        return null;
    }


    @Override
    public void updatePassword(Account account, String newPassword) {
        account.setPassword(newPassword);
    }



}
