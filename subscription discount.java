import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int daysUntilExpiration = random.nextInt(12);  // Generates a number between 0 and 11
        int discountPercentage = 0;

        System.out.println("Days until subscription expiration: " + daysUntilExpiration);

        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) {
            discountPercentage = 20;
            System.out.println("Your subscription expires within a day!");
        } else if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
            System.out.println("Your subscription expires in " + daysUntilExpiration + " days.");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in " + daysUntilExpiration + " days. Renew now!");
        }

        if (discountPercentage > 0) {
            System.out.println("Renew now and save " + discountPercentage + "%!");
        }
    }
}