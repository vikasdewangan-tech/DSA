public class TowerOfHanoi {

    // Recursive function
    static void hanoi(int n, char source, char helper, char destination) {

        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1
        hanoi(n - 1, source, destination, helper);

        // Step 2
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3
        hanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }
}