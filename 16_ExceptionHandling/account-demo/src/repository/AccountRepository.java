package repository;

import model.Account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public List<Account> getAllAccount(){
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("ngoc", "ngoc@gmail.com", "123456789", LocalDate.now()));
        accounts.add(new Account("hoang", "hoang@gmail.com", "123456789", LocalDate.now()));
        accounts.add(new Account("linh", "linh@gmail.com", "123456789", LocalDate.now()));
        accounts.add(new Account("quang", "quang@gmail.com", "123456789", LocalDate.now()));
        accounts.add(new Account("quan", "quan@gmail.com", "123456789", LocalDate.now()));
        return accounts;
    }
}
