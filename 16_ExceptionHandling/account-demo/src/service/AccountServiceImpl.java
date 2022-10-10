package service;

import model.Account;
import repository.AccountRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    AccountRepository accountRepo = new AccountRepository();
    List<Account> listAccount = accountRepo.getAllAccount();

    @Override
    public Account login(String email, String password){
        for(Account account: listAccount){
            if(account.getEmail().equals(email)){
                if(account.getPassword().equals(password)){
                    return account;
                }
            }
        }
        return null;
    }

    public Account createAccount(String userName, String email, String password){
        return new Account(userName, email, password, LocalDate.now());
    }

    @Override
    public boolean addNewAccount(Account account){
        return listAccount.add(account);
    }

    public boolean checkEmailContains(String email){
        for(Account account:listAccount){
            if(account.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void updatePassword(String email, String password){
        for (Account account : listAccount) {
            if (account.getEmail().equals(email)) {
                account.setPassword(password);
            }
        }
    }
}
