package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lesson5.labs.prob1.gui.BookWindow;
import lesson5.labs.prob1.gui.CDWindow;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	static {
		map.put(BookWindow.class, new BookRuleSet());
		map.put(CDWindow.class, new CDRuleSet());
	}

	public static RuleSet getRuleSet(Component c) {
		if (!map.containsKey(c.getClass())) {
			throw new IllegalArgumentException("No RuleSet found for this component");
		}
		return map.get(c.getClass());
	}
}
