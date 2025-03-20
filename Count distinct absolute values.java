import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] A = { -3, 1, 2, -1, 2, 3, -3 };
        HashSet<Integer> abNumbers = new HashSet<>();

        for (int num : A) {
            abNumbers.add(Math.abs(num));
        }

        System.out.println("Number of distinct absolute values: " + abNumbers.size());
    }
}