package code_wars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumOfTheFirstNthTermOfSeriesTest {

	@Test
	public void test1() {
		assertEquals("1.57", SumOfTheFirstNthTermOfSeries.seriesSum(5));
	}

	@Test
	public void test2() {
		assertEquals("1.77", SumOfTheFirstNthTermOfSeries.seriesSum(9));
	}

	@Test
	public void test3() {
		assertEquals("1.94", SumOfTheFirstNthTermOfSeries.seriesSum(15));
	}

	@Test
	public void test4() {
		assertEquals("1.00", SumOfTheFirstNthTermOfSeries.seriesSum(1));
	}

}

class SumOfTheFirstNthTermOfSeries {
	public static String seriesSum(int n) {
		if (n == 0) {
			return "0.00";
		}

		double total = 0;
		double increment = 1;
		for (int i = 1; i <= n; i++) {
			total += 1 / increment;
			increment += 3;
		}
		String totalToString = String.format("%.2f", total); // %.2f:浮點數類型後面小數點兩位數

		return totalToString;
	}
}