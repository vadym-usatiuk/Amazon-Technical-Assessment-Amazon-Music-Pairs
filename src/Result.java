import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'getSongPairCount' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * INTEGER_ARRAY songs as parameter.
	 */

	public static long getSongPairCount(List<Integer> songs) {
		// Write your code here
		int[] s = new int[60];

		long matches = 0;

		for (int song : songs) {
			int ss = song % 60;
			int expected = 60 - ss;

			if (ss == 0) {
				matches += s[0];
			} else if (s[expected] > 0) {
				matches = matches + s[expected];
			}
			s[ss]++;
		}
		return matches;
	}
}
