package code_wars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReversedStringsTest {

	@Test
	public void sampleTests() {
		assertEquals("dlrow", ReversedStrings.solution("world"));
	}

}

class ReversedStrings {

	public static String solution(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.substring(i, i + 1));
		}

		return reversed.toString();
	}
}