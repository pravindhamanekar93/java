// Java Type Casting
// Type casting means converting one data type into another. For example,
// turning an int into a double.

// In Java, there are two main types of casting:

// Widening Casting (automatic) - converting a smaller type to a larger type
// size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manual) - converting a larger type to a smaller type size
// double -> float -> long -> int -> char -> short -> byte
class type_casting {
    public static void main(String[] args) {
        // int num = 9;
        // double doublenum = num;
        // System.out.println(doublenum);
        // this ex for widening catsing

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /*
         * Calculate the percentage of the user's score in relation to the maximum
         * available score.
         * Convert userScore to double to make sure that the division is accurate
         */
        double percentage = (double) userScore / maxScore * 100.0d;

        // System.out.println(percentage);
        System.out.println(String.format("%.5f", percentage));

    }
}