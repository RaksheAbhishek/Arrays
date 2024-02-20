import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String text = scanner.nextLine();
	        countCharacters(text);
	    }

	    public static void countCharacters(String text) {
	        Map<Character, Integer> charCount = new HashMap<>();

	        for (char c : text.toCharArray()) {
	            if (Character.isLetterOrDigit(c)) {
	                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	            }
	        }

	        charCount.entrySet().stream()
	                .sorted(Map.Entry.comparingByKey())
	                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	    }
	

}
