package Lesson2;


public class AccountFix extends AccountAbstract {

    public AccountFix(Double balance) {
        super(balance);
    }

    @Override
    public void replenish(Double amount) throws Exception {
        throw new Exception("Пополнение баланса запрещено");
    }

    @Override
    public void withdraw(Double amount) throws Exception {
        throw new Exception("Снятие средств запрещено");
    }

    public static class Main2 {
        public static void main(String[] args) {
            Account account = new Account(0.0);
            AccountCredit accountCredit = new AccountCredit(0.0, 10.0);
            AccountDeposit accountDeposit = new AccountDeposit(0.0);
            AccountFix accountFix = new AccountFix(4000.0);

            try {
                account.replenish(1000.0);
                System.out.println("Баланс обычного счета: " + account.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс обычного счета: " + e.getMessage());
            }

            try {
                accountCredit.replenish(2000.0);
                System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс кредитного счета: " + e.getMessage());
            }

            try {
                accountDeposit.replenish(3000.0);
                System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс депозитного счета: " + e.getMessage());
            }

            System.out.println("Баланс фиксированного счета: " + accountFix.getCurrentBalance());

            try {
                System.out.println("Пополнение обычного счета на сумму -10.0");
                account.replenish(-100.0);
                System.out.println("Баланс обычного счета: " + account.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс обычного счета: " + e.getMessage());
            }

            try {
                System.out.println("Пополнение с фиксированного счета суммы 100.0");
                accountFix.replenish(1000.0);
                System.out.println(accountFix.getCurrentBalance());
                System.out.println("Баланс фиксированного счета: " + accountFix.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс фиксированного счета: " + e.getMessage());
            }

            try {
                System.out.println("Снятие с кредитного счета суммы 200.0");
                accountCredit.withdraw(2000.0);
                System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс кредитного счета: " + e.getMessage());
            }

            try {
                System.out.println("Снятие с кредитного счета суммы 100.0");
                accountCredit.withdraw(1000.0);
                System.out.println("Баланс кредитного счета: " + accountCredit.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс кредитного счета: " + e.getMessage());
            }

            try {
                System.out.println("Снятие с депозитного счета суммы 100.0");
                accountDeposit.withdraw(1000.0);
                System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс депозитного счета: " + e.getMessage());
            }

            try {
                System.out.println("Снятие с депозитного счета суммы 100.0");
                accountDeposit.withdraw(1000.0);
                System.out.println("Баланс депозитного счета: " + accountDeposit.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс депозитного счета: " + e.getMessage());
            }

            try {

                System.out.println("Снятие с фиксированного счета суммы 100.0");
                accountFix.withdraw(1000.0);
                System.out.println("Баланс фиксированного счета: " + accountFix.getCurrentBalance());
            } catch (Exception e) {
                System.out.println("Баланс фиксированного счета: " + e.getMessage());
            }
        }
    }

    public static class AccountFixed {
    }
}