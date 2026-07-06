public class Arrays13 {
    public static void main(String[] args) {
        // Check if exactly 4 integers are passed
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        // Parse command line arguments into a 2x2 array
        int[][] arr = new int[2][2];
        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
            }
        }

        // Print the given array
        System.out.println("The given array is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Reverse the array
        System.out.println("The reverse of the array is :");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
