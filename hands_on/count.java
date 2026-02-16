package hands_on;

public class count {
    public static void main(String[] args) {
        int n = 178;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);

    }

}

// 2. The Logic Inside
// Inside the loop, two things happen every single time:

// num /= 10;: This is the "peeling" step. In Java, when you divide an integer
// by an integer, it performs integer division (it throws away the remainder).

// If num is 582, then 582 / 10 becomes 58. The 2 is gone.

// Next time, 58 / 10 becomes 5. The 8 is gone.

// Finally, 5 / 10 becomes 0. The loop ends.

// count++;: Every time we successfully divide by 10, we add 1 to our counter.