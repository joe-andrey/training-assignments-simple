package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();
    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        // 1. Assuming result is 9-digit bank account number, validate 11-test:
        int sum = calculateCheckSum(counterAccount);
        if (sum % 11 == 0) {
            // 2. Look up counter account and make transfer object:
            return doTransfer(counterAccount, amount);
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }

	private Transfer doTransfer(String counterAccount, Money amount) throws BusinessException {
		CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
		Transfer result = new Transfer(this, acct, amount); // <2>
		// 3. Check whether withdrawal is to registered counter account:
		if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
		{
		    return result;
		} else {
		    throw new BusinessException("Counter-account not registered!");
		}
	}

	private int calculateCheckSum(String counterAccount) {
		int sum = 0; // <1>
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
		return sum;
	}

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
// end::SavingsAccount[]
