/**
 * The CheckingAccount class extends Account.
 * This account does not give any interest.
 * It allows deposit and withdrawals with no fees.
 * The balance cannot go below $0 through a withdrawal.
 *
 * A checking account also allows the users to use checks may be used to make withdrawals.
 * The first three check uses in a month are free,
 * but subsequent uses add a fee of $2 to each check withdrawal.
 * Checks are allowed to take the balance negative (i.e., an overdraft).
 * If the balance goes negative the user incurs an overdraft fee of $35.
 * If the balance is negative we do not allow any additional
 *     withdrawals until enough money is deposited to cover the fee.
 *
 * Refer to the writeup for a more detailed description!
 */
public class CheckingAccount extends Account {

    // Stores the number of checks used every month.
    // Starts at 0, and can be reset using a method below.
    private int numberOfChecksUsed;

    // Indicates wether the account currently has an uncovered overdraft fee
    private boolean inOverdraft;

    /**
     * Constructor for our banks checking accounts
     *
     */
    public CheckingAccount(String id, double initialDeposit) throws InsufficientFundsException {
        //TODO: implement
    }

    /**This method makes the numberOfChecksUsed zero.*/
    public void resetChecksUsed() {
        //TODO: implement
    }

    /**
     * This method returns the numberOfChecksUsed.
     *
     */
    public int getChecksUsed() {
        //TODO: implement
        return 0;
    }

    /**
     * Implements abstract deposit method.
     * Adds money to the checking account and returns the new balance.
     *
     *
     */
    public double deposit(double amount) {
        //TODO: implement
        return 0;
    }

    /**
     * Implements abstract withdraw method.
     * Rejects withdrawal if the withdrawal would put the account bellow $0 and throws an exception.
     * Rejects withdrawal if the account is in overdraft and throws an exception.
     *
     * Returns the balance after the withdrawal.
     *
     */
    public double withdraw(double amount) throws InsufficientFundsException {

        double requiredDeposit; // need to set this to proper value
        String overdraftRejection = "USER: (" + id + ") CANNOT MAKE A WITHDRAWAL FROM THEIR CHECKING ACCOUNT " +
                "UNTIL THEY COVER THEIR OVERDRAFT FEE " +
                "WITH A DEPOSIT OF AT LEAST ($" + requiredDeposit + ")";

        double maxPossibleWithdrawal; // need to set this to proper value
        String exceptionMSG =
                "THE MAXIMUM AMOUNT USER: (" + id + ") CAN WITHDRAW FROM THEIR CHECKING ACCOUNT IS " +
                "($" + maxPossibleWithdrawal + ")";

        //TODO: implement

        return 0;
    }


    /**
     * Method pulls money from the users account when someone cashes their check and
     * returns the balance after the withdrawal
     *
     * If the account is in overdraft reject the check and inform the check writer(id) of
     * how much they need to deposit to make withdrawals.
     *
     * Otherwise this check can withdraw any amount of money. If it puts the account balance
     * below $0 place the account in overdraft.
     *
     * If the check writer has already used up his free checks,
     * there is an additional $2 fee for this withdrawal.
     *
     */
    public double withdrawUsingCheck(double amount) throws InsufficientFundsException {

        double requiredDeposit; // need to set this to proper value
        String overdraftRejection = "USER: (" + id + ") CANNOT MAKE A WITHDRAWAL FROM THEIR CHECKING ACCOUNT " +
            "UNTIL THEY COVER THEIR OVERDRAFT FEE " +
            "WITH A DEPOSIT OF AT LEAST ($" + requiredDeposit + ")";

        //TODO: implement
        return 0;
    }
}
