
package com.mybank.domain;

/**
 *
 * @author taurus
 */
public class Customer {

    private final String firstName;
    private final String lastName;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new Account[10];
        numberOfAccounts=0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public void addAccount(Account account) {
        accounts[numberOfAccounts]=account;
        numberOfAccounts++;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    

}
