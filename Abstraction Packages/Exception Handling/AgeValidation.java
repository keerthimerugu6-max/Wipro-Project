// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        try {
            // Check if arguments are provided
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide both name and age as arguments.");
            }

            String name = args[0];
            int age;

            // Try parsing age
            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new InvalidAgeException("Age must be a valid integer.");
            }

            // Validate age range
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be between 18 and 59.");
            }

            // If valid, display details
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Validation successful!");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
