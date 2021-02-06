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

		boolean isNotAllSpaces = false;
		for (int index = 0; index < original.length(); index++) {
			if (!original.substring(index, index + 1).equals(" ")) {
				isNotAllSpaces = true;
			}
		}

		if (!isNotAllSpaces) {
			return original;
		}

		String arr[] = original.split(" ");
		int i = 0;
		for (String str : arr) {
			arr[i] = new StringBuilder(str).reverse().toString(); // 直接new StringBuilder，不用給變數名稱
			i++;
		}

		return String.join(" ", arr); // String.join()：JDK8新增方法--拼接，第一個參數為拼接符號，第二個參數為陣列或集合
	}
}