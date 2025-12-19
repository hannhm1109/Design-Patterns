package net.nahim;

import net.nahim.model.AccountStatus;
import net.nahim.model.AccountType;
import net.nahim.model.BankAccount;
import net.nahim.model.BankDirector;
import net.nahim.repository.AccountRepository;
import net.nahim.repository.AccountRepositoryImpl;
import net.nahim.util.JsonSerializer;

import java.io.IOException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer<BankAccount> bankAccountJsonSerializer = new JsonSerializer<>();
        AccountRepositoryImpl accountRepository =  AccountRepositoryImpl.getInstance();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                accountRepository.populateData();
            }).start();
        }
        System.out.println("Tape a character:");
        System.in.read();
        accountRepository.populateData();
        List<BankAccount> bankAccounts = accountRepository.findAll();
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);


    }
}