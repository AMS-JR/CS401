package codeForPartE.prob4E;

import java.util.List;
import java.util.ArrayList;

public class Employee {
	private String name;
	private List<Account> accounts;
	public Employee(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }
	public String getName() {
        return name;
    }
	public void addAccount(Account account) {
        accounts.add(account);
    }
	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
        for (Account account : accounts) {
            sum += account.computeUpdatedBalance();
        }
        return sum;
	}
}
