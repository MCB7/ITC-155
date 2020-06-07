
public class isPalindrome {
	public static boolean palindrome(String word) { int size = word.length(); 
	word = word.toUpperCase(); 
	for(int i = 0; i < size; i ++) { 
		if (word.charAt(i) != word.charAt(size - i - 1) )
		{ return false; } } 
	return true; }

    public static void main(String[] args) {
 System.out.print(palindrome("radar"));
 System.out.print("\n");
 System.out.print(palindrome("dad"));
 System.out.print("\n");
 System.out.print(palindrome("dead"));
}
}
