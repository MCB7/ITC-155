import java.util.*; 
public class RemoveEvenLength {
public static void main(String[] args) {
ArrayList<String> bands = new ArrayList<>();
bands.add("Tool");
bands.add("Phish");
bands.add("Pink Floyd");
bands.add("My Mine");
for (int i = 0; i < bands.size(); i++) {
	bands.remove(i);
	
}
System.out.println("Odd length strings = " + bands);

}
}
