public class LibraryMembership {
public static void main(String[] args) {
Random random = new Random();
int daysLeft = random.nextInt(30);

if (daysLeft < 1) {
System.out.println("Your library membership has expired! Renew now.");
} else if (daysLeft <= 7) {
System.out.println("Your membership expires in " + daysLeft + " days. Renew soon!");
} else {
System.out.println("Your library membership is valid for " + daysLeft + " more days.");
}
}
}