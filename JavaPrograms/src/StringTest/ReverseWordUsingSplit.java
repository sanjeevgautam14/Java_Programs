package StringTest;

public class ReverseWordUsingSplit {

	public static void main(String[] args) {
		String str = "Rain in Bangalore";

        // Split the string into words
        String[] words = str.split(" ");

        String reverse = "";

        // Traverse the array from last to first
        for (int i = words.length - 1; i >= 0; i--) {
            reverse = reverse + words[i] + " ";
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed Words  : " + reverse.trim());

	}

}
