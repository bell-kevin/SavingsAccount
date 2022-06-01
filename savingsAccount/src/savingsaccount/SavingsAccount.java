package savingsaccount;

import java.util.Scanner;

public class SavingsAccount {

    private double balance = 0.0;
    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate / 100.0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void growAccount(int cycles) {
        for (int i = 0; i < cycles; i++) {
            this.balance += (this.interestRate * this.balance);
        }
    }
}
