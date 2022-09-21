package bankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void depositMoney(){
        //given i have an account
        Account judesAccount = new Account();
        //when i deposit 3000
        judesAccount.deposit(3000);
        //check that my balance increases by 3000
        assertEquals(3000,judesAccount.getBalance());
    }

    @Test
    public void NegativeMoneyDepositFail(){
        //given i have an account
        Account judesAccount = new Account();
        //When i deposit 10000 my balance should be 10000
        judesAccount.deposit(10000);
        assertEquals(10000, judesAccount.getBalance());
        //when i deposit -8000
        judesAccount.deposit(-5000);
        //check balance is 10000
        assertEquals(10000,judesAccount.getBalance());
    }

    @Test
    public void WithdrawAmount(){
        // given I have an account
        Account judesAccount = new Account();
        // when I deposit 10000, balance should be 10000
        judesAccount.deposit(10000);
        assertEquals(10000, judesAccount.getBalance());
        //when I withdraw 5000, balance should be 5000
        judesAccount.withdrawAmount(5000);
        assertEquals(5000, judesAccount.getBalance());


    }
}