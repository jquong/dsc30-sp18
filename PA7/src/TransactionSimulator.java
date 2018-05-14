public class TransactionSimulator {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setSavingsInterest(0.25);

        /* Create Account examples */

        // successfully create savings account
        bank.createSavingsAccount("alice", 100.00);

        // successfully create savings account with bonus
        bank.createSavingsAccount("kyle", 5000.00);

        // fail creating savings account since initialDeposit is less than 100
        bank.createSavingsAccount("don", 99.99);

        // successfully create checking account
        bank.createCheckingAccount("bob", 10.00);

        // successfully create checking account
        bank.createCheckingAccount("roy", 100.00);

        // fail creating checking account since initialDeposit is less than 0.01
        bank.createCheckingAccount("zoe", 0.00);

        // fail creating checking account since bob already has an account
        boolean flag = bank.createCheckingAccount("bob", 1.00);
        System.out.println("Bob can create duplicate account: " + flag);

        // only alice, kyle, bob and roy has successfully create account
        System.out.println("Number of accounts: " + bank.numberOfAccounts());


        /* Deposit examples */

        System.out.println("Don wants to deposit to a non-existed account, so the returned double is: "
                            + bank.deposit("don", 20.00));

        System.out.println("Alice wants to deposit $20 to her existed account with balance $100, " +
                            "so the returned double is: " + bank.deposit("alice", 20.00));

        System.out.println("Kyle wants to deposit $0 to his existed account with balance $5000 + 250 bonus, " +
                            "so the returned double is: " + bank.deposit("kyle", 0));

        /* Withdraw examples */

        System.out.println("Don wants to withdraw from a non-existed account, so the returned double is: "
                            + bank.withdraw("don", 20.00));

        System.out.println("Alice wants to withdraw $10 ($2 extra withdrawal fee of saving account) " +
                            "from her account with balance $120, so the returned double is: " +
                            bank.withdraw("alice", 10.00));

        // fail to withdraw because minimum balance of savings account should be 100
        System.out.println("Alice wants to withdraw $10 ($2 extra withdrawal fee of saving account)" +
                           " from her account with balance $108, so the returned double is: "
                            + bank.withdraw("alice", 10.00));

        System.out.println("Bob wants to withdraw $5 (no extra withdrawal fee of checking account) " +
                            "from his account with balance $10, so the returned double is: " +
                            bank.withdraw("bob", 5.00));

        // fail to withdraw because checking account has overdraft protection
        System.out.println("Bob wants to withdraw $6 (no extra withdrawal fee of checking account) " +
                            "from his account with balance $5, which won't be allowed, " +
                            "so the returned double is: " + bank.withdraw("bob", 6.00));

        /* Online transfer examples */

        // kyle transfers $5000 to alice, with $2 withdrawal fee of saving account
        bank.onlineTransfer("kyle", "alice", 5000.00);

        bank.printAccount("kyle");
        bank.printAccount("alice");

        // roy transfers $10 to bob, with no withdrawal fee of checking account
        bank.onlineTransfer("roy", "bob", 10.00);

        bank.printAccount("roy");
        bank.printAccount("bob");

        System.out.println("Don doesn't have account so the returned boolean is: " +
                            bank.onlineTransfer("don", "bob", 10.00));

        System.out.println("Zoe doesn't have account so the returned boolean is: " +
                            bank.onlineTransfer("roy", "zoe", 10.00));

        System.out.println("Roy transfers way too much so the returned boolean is:: " +
                            bank.onlineTransfer("roy", "bob", 1000.00));

        /* Check transfer examples */

        // Roy uses all the 3 free checks for this month
        bank.checkTransfer("roy", "bob", 1.00);

        bank.printAccount("roy");
        bank.printAccount("bob");

        bank.checkTransfer("roy", "bob", 1.00);

        bank.printAccount("roy");
        bank.printAccount("bob");

        bank.checkTransfer("roy", "bob", 1.00);

        bank.printAccount("roy");
        bank.printAccount("bob");

        // After 3 free checks, Roy's each extra check would take $2 check fee
        bank.checkTransfer("roy", "bob", 1.00);

        bank.printAccount("roy");
        bank.printAccount("bob");

        // Bob overdrafts his checking account
        bank.checkTransfer("bob", "roy", 50.00);
        bank.printAccount("roy");
        bank.printAccount("bob");

        System.out.println("Bob's balance is now -$31 and he also need to pay $35 overdraft fee, so he can't " +
                "transfer now: " + bank.checkTransfer("bob", "roy", 10.00));

        // Bob just deposited $70 so he can transfer now
        bank.deposit("bob", 70.00);
        System.out.println("Bob just deposited $70 so he can transfer now: " +
                            bank.checkTransfer("bob", "roy", 1.00));

        System.out.println("Don doesn't have account so the returned boolean is: " +
                bank.checkTransfer("don", "roy", 1.00));

        System.out.println("Zoe doesn't have account so the returned boolean is: " +
                bank.checkTransfer("bob", "zoe", 1.00));

        System.out.println("The fromAccount of Kyle is not checking account, so returned boolean is: " +
                bank.checkTransfer("kyle", "bob", 1.00));

        // after adding interest, saving account would have interest but not checking account
        bank.addInterest();
        bank.printAccount("alice");
        bank.printAccount("kyle");
        bank.printAccount("roy");
        bank.printAccount("bob");


    }
}
