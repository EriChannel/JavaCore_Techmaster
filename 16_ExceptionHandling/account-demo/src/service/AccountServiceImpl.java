package service;

import model.Account;
import repository.AccountRepository;

import java.util.List;

public class AccountServiceImpl implements AccountService{

    AccountRepository accountRepo;
    List<Account> listAccount;

    public AccountServiceImpl() {
        accountRepo = new AccountRepository();
        listAccount = accountRepo.getAllAcounts();
    }

    @Override
    public Account checkLogin(String email, String password) {
        for(Account account : listAccount){
            if(account.getEmail().equals(email))
                if(account.getPassword().equals(password)){
                    return account;
                }
        }
        return null;
    }

    @Override
    public boolean addNewAccount(Account account) {
        return listAccount.add(account);
    }

    @Override
    public void updatePassword(String email, String newPassword) {
        for(Account account : listAccount){
            if(account.getEmail().equals(email)){
                account.setPassword(newPassword);
            }
        }
    }

    public boolean checkEmailContains(String email){
        for(Account account: listAccount){
            if(account.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
}
