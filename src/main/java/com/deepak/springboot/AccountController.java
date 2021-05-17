package com.deepak.springboot;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/ba/{accn}")
    public double getBalance(@PathVariable int accn) {
        System.out.println("AC-getBalance() : " + accn);
        return 25000;
    }

    @GetMapping("/account/{accn}")
    public Account getAccountByAccno(@PathVariable int accn) {
        System.out.println("AC-getAccountByAccno() : " + accn);
        Account myacc = new Account(accn, 35000, "SA");
        return myacc;

    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        System.out.println("------AC-getAllAccounts() -----");
        Account acc1 = new Account(101, 35000, "SA");
        Account acc2 = new Account(102, 55000, "SA");
        Account acc3 = new Account(103, 25000, "SA");
        Account acc4 = new Account(104, 95000, "SA");
        Account acc5 = new Account(105, 15000, "SA");
        List<Account> accList = new ArrayList<>();
        accList.add(acc1);
        accList.add(acc2);
        accList.add(acc3);
        accList.add(acc4);
        accList.add(acc5);
        return accList;

    }
}
