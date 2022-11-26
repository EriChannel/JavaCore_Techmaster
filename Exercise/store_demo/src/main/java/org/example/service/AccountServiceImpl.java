package org.example.service;

import org.example.model.account.Account;
import org.example.repository.AccountRepository;

import java.util.List;

public class AccountServiceImpl {

    public List<Account> getAllAccounts(){
        return AccountRepository.accountList;
    }

    public Account checkLogin(String mobile, String password){
        for(Account account: getAllAccounts()){
            if(mobile.equals(account.getMobile())){
                if(password.equals(account.getPassword())){
                    return account;
                }
            }
        }
        return null;
    }

    public boolean addNewAccount(Account account){
        return getAllAccounts().add(account);
    }

    public int getMaxId(){
        int max = 0;
        for(Account account: getAllAccounts()){
            if(account.getId() > max){
                max = account.getId();
            }
        }
        return max + 1;
    }

    public void updatePassword(Account account, String newAccount){
        account.setPassword(newAccount);
    }

    public Account checkAccountExists(String mobile){
        for(Account account : getAllAccounts()){
            if(account.getMobile().equals(mobile)){
                return account;
            }
        }
        return null;
    }

    public Account getAccountById(int id){
        for(Account account: getAllAccounts()){
            if(account.getId() == id){
                return account;
            }
        }
        return null;
    }


}
