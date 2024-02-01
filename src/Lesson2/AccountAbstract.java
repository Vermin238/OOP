package Lesson2;

import Lesson2.Interface.AccountInterface;

public abstract class AccountAbstract implements AccountInterface {

    protected Double balance;

    public AccountAbstract(Double balance) {
        this.balance = balance;
    }

    public abstract void replenish(Double amount) throws Exception;

    public abstract void withdraw(Double amount) throws Exception;

    public Double getCurrentBalance() {
        return this.balance;
    };
}