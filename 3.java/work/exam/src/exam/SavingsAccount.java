package exam;

public class SavingsAccount extends BankAccount {
	
	@Override
	void withdraw(int amount) {
		super.withdraw(amount);
		
		if(amount < balance / 2) {
			balance -= amount;
		} else if(amount > balance / 2) {
			System.out.println("적금 계좌는 한번에 잔액의 50%만 출금 가능합니다");
		}
	}
	
}
