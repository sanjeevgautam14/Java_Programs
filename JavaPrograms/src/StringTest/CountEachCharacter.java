package StringTest;

public class CountEachCharacter {

	public static void main(String[] args) {
	    String str = "Today is a good day";

        // Split the sentence into words
        String[] words = str.split(" ");

        // Reverse the order of words
        for (int i = 0, j = words.length - 1; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        // Reverse words at even positions (2,4,6...)
        for (int i = 0; i < words.length; i++) {

            if ((i + 1) % 2 == 0) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        // Print the result
        System.out.println(String.join(" ", words));

	}

}
