package be.cegeka.tdd.kata;

public class Transfer {

    private String description;
    private int bankAccountNumber;
    private double amount;
    private int id;

    public Transfer(String description, int bankAccountNumber, double amount) {
        this.description = description;
        this.bankAccountNumber = bankAccountNumber;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }
}
