public class ExamResult {
public static void main(String[] args) {
Random random = new Random();
int score = random.nextInt(101);
System.out.println("Student Score: " + score);

if (score >= 90) {
System.out.println("Grade: A");
} else if (score >= 80) {
System.out.println("Grade: B");
} else if (score >= 70) {
System.out.println("Grade: C");
} else if (score >= 60) {
System.out.println("Grade: D");
} else {
System.out.println("Grade: F - Fail");
}
}
}