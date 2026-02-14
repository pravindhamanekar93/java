package hands_on;

public class strong_no {

    public static void main(String[] args) {
        int n = 145;
        int temp = n; // Save the original number to compare later
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10; // 1. Get the last digit

            // 2. Find factorial of that digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact; // 3. Add factorial to sum
            temp /= 10; // 4. Remove the last digit
        }

        if (sum == n) {
            System.out.println(n + " is a Strong Number");
        } else {
            System.out.println(n + " is not a Strong Number");
        }
    }

}

// Gemini said
// In programming, a Strong Number is a special number where the sum of the
// factorials of its digits is equal to the number itself.