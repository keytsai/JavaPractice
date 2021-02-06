package code_wars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseWordsTest {

	@Test
	public void exampleCases() {
		assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god",
				ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
		assertEquals("elppa", ReverseWords.reverseWords("apple"));
		assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
		assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
	}

	@Test
	public void spacesTest() {

		assertEquals("   ", ReverseWords.reverseWords("   "));
	}

}

class ReverseWords {
	public static String reverseWords(final String original) {

		StringBuilder originalToStringBuilder = new StringBuilder();
		boolean isNotAllSpaces = false;
		for (int index = original.length() - 1; index >= 0; index--) {
			if (!original.substring(index, index + 1).equals(" ")) {
				isNotAllSpaces = true;
			}
		}

		String reversedToString = "";
		StringBuilder reversed = new StringBuilder();
		if (isNotAllSpaces) {
			for (int index = original.length() - 1; index >= 0; index--) {
				originalToStringBuilder.append(original.substring(index, index + 1));
			}

			String reverseArr[] = originalToStringBuilder.toString().split(" ");

			for (int endIndex = reverseArr.length - 1; endIndex >= 0; endIndex--) {
				reversed.append(reverseArr[endIndex]).append(" ");
			}
			reversed.delete(reversed.length() - 1, reversed.length());
			reversedToString = reversed.toString();
		} else {
			reversedToString = original;
		}

		return reversedToString;
	}
}