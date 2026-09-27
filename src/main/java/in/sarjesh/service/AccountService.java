package in.sarjesh.service;

import in.sarjesh.entity.Account;
import in.sarjesh.entity.AccountPK;
import in.sarjesh.repository.AccountRepository;

import java.sql.SQLOutput;
import java.util.Optional;

@org.springframework.stereotype.Service
public class AccountService {

    private AccountRepository accRepo ;
    public AccountService(AccountRepository accRepo) {
        this.accRepo = accRepo;
    }
//    public void getDataUsingPK (){
//
//        AccountPK pk = new AccountPK();
//        pk.setAccId(101);
//        pk.setAccType("Saving");
//        pk.setHolderName("TCS");
//
//        Optional<Account> acc = accRepo.findById(pk);
//        if(acc.isPresent()){
//            System.out.println(acc.get());
//        }else {
//            System.out.println("Data not found");
//        }
//    }

    public void saveData(){
        AccountPK pk = new AccountPK();
        pk.setAccId(105);
        pk.setAccType("Saving");
        pk.setHolderName("TRBM");

        Account acc = new Account();
        acc.setBranchName("Indore");
        acc.setMinBalance(50000.00);
        acc.setAccPk(pk);

        accRepo.save(acc);
    }
}
