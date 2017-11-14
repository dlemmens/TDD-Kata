package be.cegeka.tdd.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class BankAccountTest {

    @Test
    public void givenBankAccount_shouldContainName() throws Exception {
        BankAccount bankAccount = new BankAccount("name",1258,1258.025);
        assertThat(bankAccount.getName()).isEqualTo("name");
    }

    @Test
    public void givenBankAccount_shouldContainBankAccountNumber() throws Exception {
        BankAccount bankAccount = new BankAccount("Thibault",11257,1256.201);
        assertThat(bankAccount.getBankAccountNumber()).isEqualTo(11257);
    }

    @Test
    public void givenBankAccount_shouldContainAmount() throws Exception {
        BankAccount bankAccount = new BankAccount("Thibault", 12566,1258.206);
        assertThat(bankAccount.getAmount()).isEqualTo(1258.206);
    }

    @Test
    public void givenWithdrawAmount_shouldReturnAmountMinusWitdrawAmount() throws Exception {
        BankAccount bankAccount = new BankAccount("Thibault", 12566,1258.206);
        double withDrawAmount = 22.54;
        assertThat(bankAccount.withdrawAmount(withDrawAmount)).isEqualTo(1235.666);
    }

    @Test
    public void givenDepositAmount_shouldReturnAmountPlusDepositAmount() throws Exception {
        BankAccount bankAccount = new BankAccount("Thibault", 12566,1258.206);
        double depositAmount = 22.54;
        assertThat(bankAccount.depositAmount(depositAmount)).isEqualTo(1280.746,offset(0.001));
    }

    @Test
    public void whenAUserWantsToTransfer_transferShouldContainDescription_bankAccountNumber_amount() throws Exception {
        BankAccount bankAccountA = new BankAccount("Domien",587,257.254);
        BankAccount bankAccountB = new BankAccount("Thibault",597,257.254);

        Transfer testTransfer = new Transfer("Despositing from a to b.",12589,2.2);
        bankAccountA.transferMoney(testTransfer,bankAccountA, bankAccountB);
        assertThat(bankAccountB.getAmount()).isEqualTo(259.454);

    }
}
