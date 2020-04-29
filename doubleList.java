import java.util.ArrayList;

public class doubleList {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("how");
		words.add("are");
		words.add("you?");
		
		 int originalSize = words.size();
		    
		    for (int i = 0; i < originalSize; i++) {
		        String word = words.get(2 * i);
		        words.add(2 * i + 1, word);
		    }
		    System.out.println(words);    
	}
}
