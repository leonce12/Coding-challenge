public class Main {
    public static void main(String[] args) {
        int value = 1;

        // Increment
        value++;
        System.out.println("First Increment: " + value);
        value += 1;
        System.out.println("Second Increment: " + value);
        value++;
        System.out.println("Third Increment: " + value);

        // Decrement
        value--;
        System.out.println("First Decrement: " + value);
        value -= 1;
        System.out.println("Second Decrement: " + value);
        value--;
        System.out.println("Third Decrement: " + value);
    }
}