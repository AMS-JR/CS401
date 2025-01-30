package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		BookWindow bookWindow = (BookWindow) ob;

		// Rule A: All fields must be nonempty
		if (bookWindow.getTitleValue().isEmpty() || bookWindow.getIsbnValue().isEmpty() || bookWindow.getPriceValue().isEmpty()) {
			throw new RuleException("All fields must be nonempty.");
		}

		String isbn = bookWindow.getIsbnValue();
		String price = bookWindow.getPriceValue();

		// Rule B: ISBN must be numeric and consist of either 10 or 13 characters
		if (!isbn.matches("\\d{10}|\\d{13}")) {
			throw new RuleException("ISBN must be numeric and consist of either 10 or 13 characters.");
		}

		// Rule C: If ISBN has length 10, the first digit must be 0 or 1
		if (isbn.length() == 10 && !isbn.startsWith("0") && !isbn.startsWith("1")) {
			throw new RuleException("ISBN with 10 characters must start with 0 or 1.");
		}

		// Rule D: If ISBN has length 13, the first 3 digits must be either 978 or 979
		if (isbn.length() == 13 && !(isbn.startsWith("978") || isbn.startsWith("979"))) {
			throw new RuleException("ISBN with 13 characters must start with 978 or 979.");
		}

		// Rule E: Price must be a floating point number with two decimal places
		if (!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places.");
		}

		// Rule F: Price must be a number greater than 0.49
		double priceValue = Double.parseDouble(price);
		if (priceValue <= 0.49) {
			throw new RuleException("Price must be greater than 0.49.");
		}
	}

}
