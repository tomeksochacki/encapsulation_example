package com.encapsulationexampletest;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();


        System.out.println(bankAccount1.getBalance());
        if (bankAccount1.withDraw(530)){
            System.out.println("Withdraw.");
        } else {
            System.out.println("Not enough money.");
        }
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount1.deposit(400));
        System.out.println(bankAccount1.getBalance());
    }
}

class BankAccount{
    private int balance;

    BankAccount(){
        balance = 1000;
    }
    int getBalance(){
        return balance;
    }
    private boolean setBalance(int balance){

        /*
            CONDITION!!!!
         */
        this.balance = balance;
        return true;
    }

    boolean withDraw(int howMuch){
        if (balance<howMuch){
            return false;
        } else {
            setBalance(balance - howMuch);
        }
        return true;
    }
    boolean deposit(int howMuch){
        setBalance(balance + howMuch);
        return true;
    }
}
