package hands_on;

public class perfect_no {

    public static void main(String[] args) {
        // A Perfect Number is a positive integer that is equal to the sum of its proper
        // divisors (excluding the number itself).
        // The Classic Example: 6
        // Find the divisors: 6 can be divided by 1, 2, 3, and 6.
        // Identify "proper" divisors: We ignore the number itself (6), so we take 1, 2,
        // and 3.
        // Sum them up: $1 + 2 + 3 = 6$.

        int n = 28;
        int sum = 0;

        // Loop from 1 up to n/2 (since no divisor > n/2 exists besides n itself)
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i; // Add the divisor to our running total
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }

    }

}
