public class Main {
    public static void main(String[] args) {
        int value = 1;
        value++;
        System.out.println("First: " + value);  // 2
        System.out.println("Second: " + value++);  // 2 (then value becomes 3)
        System.out.println("Third: " + value);  // 3
        System.out.println("Fourth: " + (++value));  // 4

        value = 1;
        ++value;
        value++;
        System.out.println("First after reset: " + value);  // 3
    }
}