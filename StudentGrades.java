import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {

public static void main (String[] args) {
Scanner scnr = new Scanner(System.in);
String studentName;
double studentGrade;

HashMap<String, Double> studentGrades = new HashMap<String, Double>();

// Students's grades (pre-entered)
studentGrades.put("Harry Rawlins", 84.3);
studentGrades.put("Stephanie Kong", 91.0);
studentGrades.put("Shailen Tennyson", 78.6);
studentGrades.put("Quincy Wraight", 65.4);
studentGrades.put("Janine Antinori", 98.2);

// TODO: Read in new grade for a student, output initial
// grade, replace with new grade in HashMap,
// output new grade

System.out.print("Please enter student's name:  ");
studentName = scnr.nextLine();
if (studentGrades.containsKey(studentName)) {
	studentGrade = studentGrades.get(studentName); {
		System.out.print(studentName + "s original grade: "+ studentGrade );
	Double newGrade = studentGrades.replace("Quincy Wraight", 71.3);
	System.out.println("\n");
			Double result = studentGrades.replace("Quincy Wraight", 71.3);
			if (result != null) {
				System.out.print("Quincy Wraight's new grade: " + result);
			} 
		 
	 }
	}
}

}





	







