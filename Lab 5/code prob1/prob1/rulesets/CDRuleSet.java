package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		CDWindow cdWindow = (CDWindow) ob;

		// Rule A: All fields must be nonempty
		if (cdWindow.getArtistValue().isEmpty() || cdWindow.getTitleValue().isEmpty() || cdWindow.getPriceValue().isEmpty()) {
			throw new RuleException("All fields must be nonempty.");
		}

		// Rule B: Price must be a floating point number with two decimal places
		String price = cdWindow.getPriceValue();
		if (!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places.");
		}

		// Rule C: Price must be a number greater than 0.49
		double priceValue = Double.parseDouble(price);
		if (priceValue <= 0.49) {
			throw new RuleException("Price must be greater than 0.49.");
		}
	}
	
}
