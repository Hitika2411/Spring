package spring.projects.springstarter.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.projects.springstarter.Models.Account;
import spring.projects.springstarter.Repository.AccountRepository;
@Service
public class AccountService {
    @Autowired
    private AccountRepository ar;
    public Account save(Account acc){
        return ar.save(acc);
    }
}
