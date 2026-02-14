package hands_on;

public class reverse_string {
    public static void main(String[] args) {
        String s = "Java";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println(rev);

    }

}

// this logic is same for palindrome string also
