package com.titanes.titanes.service;


import com.titanes.titanes.model.Transaction;
import com.titanes.titanes.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public void createTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public List<Transaction> readTransaction(){
        List<Transaction> transactionList = new ArrayList<Transaction>();
        transactionList.addAll(transactionRepository.findAll());
        return transactionList;
    }

    public void  updateTransactionAll(Transaction transaction){
        transactionRepository.save(transaction);
    }
   /* public void updateTransaction(Long id){
        transactionRepository.saveAll(id);
    }
    */
    public void deleteTransaction(Long id){
        transactionRepository.deleteById(id);
    }

}
