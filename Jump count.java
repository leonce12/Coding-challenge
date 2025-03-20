public class Main {
    public static int countJumps(int X, int Y, int D) {
        int jumpProgress = X;
        int count = 0;

        while (jumpProgress < Y) {
            jumpProgress += D;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 85;
        int jumpDistance = 30;

        int jumps = countJumps(start, end, jumpDistance);
        System.out.println("Number of jumps required: " + jumps);
    }
}