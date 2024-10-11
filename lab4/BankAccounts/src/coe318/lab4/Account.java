package coe318.lab4;

/**
 *
 * @author ajavf
 */
public class Account {

    public String name;
    public int number;
    public double balance;

    //constructor
    public Account(String name, int number, double initialBalance) {
        this.name = name;
        this.number = number;
        this.balance = initialBalance;

    }

    public String getName() {

        return this.name;
    }

    public double getBalance() {

        return this.balance;
    }

    public int getNumber() {

        return this.number;

    }

    public boolean deposit(double amount) {
        if (amount <= 0) {

            return false;
        } else {

            this.balance = this.balance + amount;
            return true;

        }
    }

    public boolean withdraw(double amount) {
        if ( amount > 0 && (this.balance - amount) >= 0) {
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", "
                + String.format("$%.2f", getBalance()) + ")";
    }
}