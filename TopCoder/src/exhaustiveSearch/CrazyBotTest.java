package exhaustiveSearch;

public class CrazyBotTest {
	public static void main(String[] args) {
		System.out.println(CrazyBot.getProbability(1, 25, 25, 25, 25));
		System.out.println(CrazyBot.getProbability(2, 25, 25, 25, 25));
		System.out.println(CrazyBot.getProbability(7, 50, 0, 0, 50));
		System.out.println(CrazyBot.getProbability(14, 50, 50, 0, 0));
		System.out.println(CrazyBot.getProbability(14, 25, 25, 25, 25));
	}
}