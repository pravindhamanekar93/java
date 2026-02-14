package hands_on;

public class prime_no {
    public static void main(String[] args) {
        int n = 8;
        boolean prime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");

    }

}

// for(int i=2; i<=n/2; i++): This is the search party. We start checking from 2
// up to half of the number (n/2).
