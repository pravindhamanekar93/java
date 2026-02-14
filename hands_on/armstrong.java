package hands_on;

public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int rem;
        int arg = n;
        for (int i = 1; i < n; i++) {
            while (n > 0) {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;

            }
        }
        if (sum == arg) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
