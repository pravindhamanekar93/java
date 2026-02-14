package hands_on;

public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int sum = 0;
        int rem;
        int arg = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum * 10 + rem;

            n = n / 10;
        }
        if (sum == arg) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}

// Step 2
// sum = sum * 10 + rem;

// This builds reversed number.

// First time:

// sum = 0 * 10 + 1 = 1

// Second time:

// sum = 1 * 10 + 2 = 12

// Third time:

// sum = 12 * 10 + 1 = 121
