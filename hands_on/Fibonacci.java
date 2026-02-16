package hands_on;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10; // how many numbers you want
        int first = 0, second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
