
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 2
		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		
		//Step 3
		double costOfMilk = 2.59;
		double moneyInWallet = 0.50;
		int thirstLevel = 5;
		
		//Step 4
		boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket);
		System.out.println("I should buy ice cream. " + shouldBuyIceCream);
		
		boolean willGoSwimming = (isHotOutside && !isWeekday);
		System.out.println("I will go swimming. " + willGoSwimming);
		
		boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekday);
		System.out.println("Today is a good day. " + isAGoodDay);
		
		boolean willBuyMilk = (isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk *2);
		System.out.println("I will buy milk. " + willBuyMilk);
	}
}
