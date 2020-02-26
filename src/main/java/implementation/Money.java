package implementation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Money {
	
	private final int dollars;
	private final int cents;
	
	public Money() {
		this.dollars = 0;
		this.cents = 0;
	}
	
	public Money(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}
	
	public Money(String amount) {
		Pattern pattern = Pattern.compile("^[^\\d]*([\\d]+)\\.([\\d][\\d])$");
		Matcher matcher = pattern.matcher(amount);
		
		matcher.find();
		this.dollars = Integer.parseInt(matcher.group(1));
		this.cents = Integer.parseInt(matcher.group(2));
	}
	



}
