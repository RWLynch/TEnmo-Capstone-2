package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;

import java.util.List;

public interface TransferDao {

    List<Transfer> getAllTransfers();
    List<Transfer> transferByUserId(int userId);
    void newTransfer(Transfer transfer);


}
