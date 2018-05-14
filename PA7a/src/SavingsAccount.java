/**
 * The SavingsAccount class extends Account.
 * The minimum amount a customer can keep in a savings account is $100.
 * If the customer deposits at least $5000 initially the bank gives them an additional $250 bonus
 * This account earns interest at a rate specified by the bank.
 * It allows deposits with no fees.
 * Withdrawals are charged $2 per withdrawal.
 * The balance cannot go below $100 through a withdrawal.
 *
 * Refer to the writeup for a more detailed description!
 */
public class SavingsAccount extends Account {
    private static final double MINIMUM_BALANCE = 100.0;

    /**
     * Constructor for our banks savings accounts
     * If initial deposit is at least $5000 the customer receives a $250 bonus
     *
     */
    public SavingsAccount(String userid, double initialDeposit) throws InsufficientFundsException {
        //TODO: Implement
    }


    /**
     * Implements abstract deposit method.
     * Adds money to the savings account.
     *
     */
    public double deposit(double amount) {
        //TODO: Implement
        return 0;
    }


    /**
     * Implements abstract withdraw method.
     * Savings accounts at our bank charge a WITHDRAWAL_FEE.
     * Rejects withdrawal if the withdrawal would put the account below the minimum balance
     * and throws an exception.
     *
     */
    public double withdraw(double amount) throws InsufficientFundsException {
        //TODO: Implement

        //Get the new balance
        double potentialBalance；// need to set this to proper value

        //Reject if withdrawal violates our constraints
        if (potentialBalance < MINIMUM_BALANCE) {
            double maxPossibleWithdrawal； // need to set this to proper value
            String exceptionMSG =
                    "THE MAXIMUM AMOUNT THE USER: (" + id + ") CAN "
                            + "WITHDRAW FROM THEIR SAVINGS ACCOUNT "
                            + "IS ($" + maxPossibleWithdrawal + ")";
            throw new InsufficientFundsException(exceptionMSG);
        }

        return 0;
    }


    /**
     * Method that the bank will use to add an interest payment to the savings account.
     *
     * NewBalance = OldBalance + OldBalance*InterestRate
     * ie. If OldBalance was $1000.00 and InterestRate = 2%
     *        NewBalance would be $1020.00
     */
    public double addInterest(double rate) {
        //TODO: Implement
        return 0;
    }
}
