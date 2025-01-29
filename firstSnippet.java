public class FirstSnippet {
    public static void main(String[] args) {
        int N = 4; // Change this value for testing
        if (N % 2 == 1) { // Odd numbers
            System.out.println("Weird");
        } else { // Even numbers
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else { // N > 20 and even
                System.out.println("Not Weird");
            }
        }
    }
}
