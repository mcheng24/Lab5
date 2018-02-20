import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /***/
        CHECKINGS,
        /***/
        SAVINGS,
        /***/
        STUDENT,
        /***/
        WORKPLACE
    }

    /***/
    private int accountNumber;
    /***/
    public BankAccountType accountType;
    /***/
    private double accountBalance;
    /***/
    private String ownerName;
    /***/
    public double interestRate;
    /***/
    private double interestEarned;

    /**
     *
     * @param name ownerName
     * @param accountCategory accountType
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @return owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @return interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @return interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}