package p03_encapsulation;

/*
* Creating a class for a bank account to learn about Encapsulation:
* The bank account is very popular example in the net 
*/
public class Account {
    // The class fields should be private:
    // public double balance;
    private double balance;

    // adding getter and setter:

    // Getter => for getting a value of a field:
    public double getBalance() {
        // return this.balance;
        // it works also without using balance:
        return balance;
    }

    /*
     * We used getter to get the value of a field in the "main" menu
     * Question What to do if want to change the value from the "main" method
     * 
     * - We can set the value of any field when we instantiate an object and calling
     * its constructor
     * but this can be don only one time!
     * We CANNOT use the constructor again to modify previous values of an object!
     * 
     * - We can change the field to make it public so we can directly assign a value
     * to it
     * from the main menu, but this will be a strong coupling and it's against the
     * concept of encapsulation
     * 
     * - The best coding practice is create a setter to help us access any field to
     * change its value
     * 
     * NOTE:
     * Not every class field has to have getter and setter, it's depends on what you
     * need
     */
    // Setters are void as they don't return any value
    // Setter => for setting a value to a field:
    // Still not a good idea for a bank account to assign a direct value to it!
    // check the deposit method below:
    public void setBalance(double amount) {
        // we can make our program more robust by validating the user input
        if (amount <= 0) {
            System.err.println("Invalid amount!");
        } else {
            this.balance = amount;
        }
    }

    // Make it more advanced by adding deposit/withdraw methods:
    // Setting a value using the setter is definitely not a good practice!
    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Invalid deposit amount!");
        } else {
            // this.balance = this.balance + amount;
            // Or:
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println(amount + ". Invalid withdraw amount!");
        } else {
            if (this.balance == 0) {
                System.err.println("Sorry your account balance is 0!");
            } else {
                if (balance < amount) {
                    double shortage = amount - balance;
                    System.err.println(
                            "Sorry you don't have enough balance to withdraw $" + amount + ". Your current balance is $"
                                    + this.balance + ". You are short with $" + shortage
                                    + ". Transaction Failed");
                } else {
                    this.balance -= amount;
                    System.err.println("Your current balance after withdrawing $" + amount + " is " + this.balance);
                }
            }
        }
    }
}
