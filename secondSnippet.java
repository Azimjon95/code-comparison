public class SecondSnippet {
    public static void main(String[] args) {
        int N = 4; // Change this value for testing
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if (N <= 5) {
            System.out.println("Not Weird");
        } else if (N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
