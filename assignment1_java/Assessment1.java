class Calculator {

    // Method to add two numbers
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers, returns Double.NaN if divisor is zero
    public double div(double num1, double num2) {
        if (num2 == 0.0) {
            return Double.NaN;
        }
        return num1 / num2;
    }
}

class Maths extends Calculator {

    public static void main(String[] args) {
        Maths maths = new Maths();

        // Example usage of calculator methods
        double sum = maths.add(20.5, 10.3);
        double difference = maths.sub(30.75, 15.25);
        double product = maths.mul(6.5, 7.2);
        double divisionResult = maths.div(42.0, 0.0); // Attempting to divide by zero

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Check for NaN before printing the division result
        if (Double.isNaN(divisionResult)) {
            System.out.println("Division Result: Error (Divisor cannot be zero)");
        } else {
            System.out.println("Division Result: " + divisionResult);
        }
    }
}
