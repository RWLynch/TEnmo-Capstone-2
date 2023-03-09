package com.techelevator.tenmo.controller;

import com.techelevator.tenmo.dao.AccountDao;
import com.techelevator.tenmo.dao.TransferDao;
import com.techelevator.tenmo.dao.UserDao;
import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.List;


@RestController
//@PreAuthorize("isAuthenticated()")

public class AccountController {

    //TODO @Autowired for dependency injection

    @Autowired
    UserDao userDao;

    @Autowired
    AccountDao accountDao;

    @Autowired
    TransferDao transferDao;

    User user = new User();


    //get list of all users
    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userDao.findAll();
    }

    //get user by id
    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    public User getUserByUserId(@PathVariable int id) {
        return userDao.getUserById(id);
    }


    //get account balance (logged-in user) (principal)
/*    @RequestMapping(path = "/account", method = RequestMethod.GET)
    public BigDecimal getBalance(Principal principal) {
        int userId = userDao.findIdByUsername(principal.getName());
        return accountDao.getBalance(userId);
    }*/

    @RequestMapping(path = "/account/{id}", method = RequestMethod.GET)
    public Account getAccount(@PathVariable int id) {
        return accountDao.getAccountByAccountId(id);
    }

    //get account balance by user id
//@RequestMapping(path = "balance/{id}", method = RequestMethod.GET)
//    public Balance getBalanceById(@PathVariable int id) {
//        return accountDao.getBalance(toString(id));
//}
    //get account balance by account id


    //get list of all transfers
    @RequestMapping(path = "/transfer", method = RequestMethod.GET)
    public List<Transfer> getAllTransfers(){
        return transferDao.getAllTransfers();
    }
    //get transfers by user id
//    @ResponseStatus(HttpStatus.CREATED)
//    @RequestMapping (path = "transfer/{id}", method = RequestMethod.POST)
//    public void createTransfer(@RequestBody Transfer transfer, @PathVariable int id){
//        BigDecimal amountToTransfer = transfer.getAmount();
//        Account accountFrom = accountDao.getAccountByAccountId(transfer.getAccountFrom());
//        Account accountTo = accountDao.getAccountByAccountId(transfer.getAccountTo());
//
//        accountFrom.getBalance().


    }
    //get transfers by account id
    //get transfers by transfer type id
    //get transfers by transfer status id
    //get transfers by transfer type description
    //get transfers by transfer status description

    //@RequestMapping()


