package money_money_money;

public class Money {
	public static int calculateYears(double principal, double interest,  double tax, double desired) {
		// your code
		int years = 0; double amount = principal;
		if (principal == desired) return years;
		
		while (amount < desired) {
			years++;
			amount = amountObtainedYearly(amount, interest, tax);
		}
		return years;
	}
	
	public static double amountObtainedYearly(double principal, double interest, double tax) {
		return principal + (principal * interest) - (principal * interest) * tax;
	}
}
