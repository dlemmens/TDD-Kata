package be.cegeka.tdd.kata;

public class BankAccount {

    private String name;
    private int bankAccountNumber;
    private double amount;
    private int id;

    public BankAccount(String name, int bankAccountNumber, double amount) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double withdrawAmount(double withDrawAmount){
        return amount - withDrawAmount;
    }

    public double depositAmount(double depositAmount) {
        return amount + depositAmount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BankAccount transferMoney(Transfer transfer, BankAccount bankAccountSender, BankAccount bankAccountRecipient) {
        double v = bankAccountSender.getAmount() - transfer.getAmount();
        bankAccountRecipient.setAmount(bankAccountRecipient.getAmount() + transfer.getAmount());
        return bankAccountRecipient;
    }
}
