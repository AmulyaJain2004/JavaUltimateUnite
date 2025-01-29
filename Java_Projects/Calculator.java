import java.util.Scanner;

class Calculate {
    double result;
    public void add(double num1, double num2) {
        result = num1 + num2;
        System.out.println("Addition: " + result);
    }
    public void subtract(double num1, double num2) {
        result = num1 - num2;
        System.out.println("Subtraction: " + result);
    }
    public void multiply(double num1, double num2) {
        result = num1 * num2;
        System.out.println("Multiplication: " + result);
    }
    public void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            return;
        }
        result = num1 / num2;
        System.out.println("Division: " + result);
    }
    public void modulus(double num1, double num2) {
        result = num1 % num2;
        System.out.println("Modulus: " + result);
    }
    public void power(double num1, double num2) {
        result = Math.pow(num1, num2);
        System.out.println("Power: " + result);
    }
    public void squareRoot(double num) {
        result = Math.sqrt(num);
        System.out.println("Square Root: " + result);
    }
    public void cubeRoot(double num) {
        result = Math.cbrt(num);
        System.out.println("Cube Root: " + result);
    }
    public void factorial(int num) {
        result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }
}

public class Calculator {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println("Enter operation: ");
            String operation = sc.next();
            Calculate calc = new Calculate();
            switch (operation) {
                case "+":
                    calc.add(num1, num2);
                    break;
                case "-":
                    calc.subtract(num1, num2);
                    break;
                case "*":
                    calc.multiply(num1, num2);
                    break;
                case "/":
                    calc.divide(num1, num2);
                    break;
                case "%":
                    calc.modulus(num1, num2);
                    break;
                case "^":
                    calc.power(num1, num2);
                    break;
                case "sqrt":
                    calc.squareRoot(num1);
                    break;
                case "cbrt":
                    calc.cubeRoot(num1);
                    break;
                case "!":
                    calc.factorial((int)num1);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.println("Do you want to continue? (y/n)");
            String choice = sc.next();
            if (choice == "n") {
                break;
            }
        }
    }
}
