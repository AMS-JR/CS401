package codeForPartE.prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double updatedBalanceSum = 0.0;
		for (Employee employee : list) {
            updatedBalanceSum += employee.computeUpdatedBalanceSum();
        }
		return updatedBalanceSum;
	}
}
