/**
 * OPTIONAL CLASS.
 * Use as an example of how to test a series of operations on the bank.
 */
public class TransactionSimulator {
    //Example simulation.
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setSavingsInterest(0.25);
        bank.createSavingsAccout("alice", 100.00);
        bank.createCheckingAccout("bob", 50.00);

        System.out.println("Number of accounts: " + bank.getNumberOfAccounts());

        Double result = bank.withdraw("alice", 20.00);
        System.out.println(result);

        result = bank.deposit("bob", 20.00);
        System.out.println(result);

        bank.addInterest();

        bank.printAccount("alice");
        bank.printAccount("bob");
    }
}
