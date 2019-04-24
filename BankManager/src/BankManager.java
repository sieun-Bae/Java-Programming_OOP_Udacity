import java.util.Date;

class BankAccount{
    String account;
    double balance;
}

class CheckingAccount extends BankAccount{
    double limit;
}

class SavingsAccount extends BankAccount{
    int transfers;
}

class CertificateOfDeposit extends BankAccount{
    Date expiry;
}

class BankManager {
    public static void main(String [] args){
        BankAccount tempAcc = new BankAccount();
        tempAcc.account = "testAcc";
        tempAcc.balance = 1235;

        SavingsAccount tempSAcc = new SavingsAccount();
        tempSAcc.account = "testSAcc";
        tempSAcc.balance = 1234;
        tempSAcc.transfers = 1212;
    }
}