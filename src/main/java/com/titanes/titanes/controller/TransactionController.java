package com.titanes.titanes.controller;

import com.titanes.titanes.model.Transaction;
import com.titanes.titanes.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    TransactionService transactionService;

    @PostMapping("/transaction")
    private void createTransaction(@RequestBody Transaction transaction){
        transactionService.createTransaction(transaction);
    }

    @GetMapping("/transaction")
    private List<Transaction> readTransaction(){
        return transactionService.readTransaction();
    }

    @PutMapping("/transaction")
    private void updateTransactionAll(@RequestBody Transaction transaction){
        transactionService.updateTransactionAll(transaction);
    }
    /*
    @PatchMapping("/transaction/{id}")
    private void updateTransaction(@PathVariable("id") Long id){
        transactionService.updateTransaction(id);
    }
    */
    @DeleteMapping("/transaction/{id}")
    private void deleteTransaction(@PathVariable("id") Long id){
        transactionService.deleteTransaction(id);
    }

}
