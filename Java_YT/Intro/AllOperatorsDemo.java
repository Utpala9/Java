package Intro;
public class AllOperatorsDemo {

    public static void main(String[] args) {
        System.out.println("=== DEMONSTRATING ALL JAVA OPERATORS ===\n");

        // 1. Arithmetic Operators (+, -, *, /, %, ++, --)
        System.out.println("--- 1. Arithmetic Operators ---");
        int a = 15;
        int b = 4;
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b)); // Integer division truncates
        System.out.println("Modulus/Remainder (a % b): " + (a % b));
        
        // Unary Increment / Decrement
        int c = 5;
        System.out.println("Post-increment (c++): " + (c++)); // Prints 5, then becomes 6
        System.out.println("Pre-increment (++c): " + (++c));  // Becomes 7, then prints 7
        System.out.println("Post-decrement (c--): " + (c--)); // Prints 7, then becomes 6
        System.out.println("Pre-decrement (--c): " + (--c));  // Becomes 5, then prints 5


        // 2. Assignment Operators (=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)
        System.out.println("\n--- 2. Assignment Operators ---");
        int assignVal = 10; // Simple assignment
        System.out.println("Simple Assignment (=): " + assignVal);
        assignVal += 5; // Equivalent to: assignVal = assignVal + 5
        System.out.println("Add and Assign (+=): " + assignVal);
        assignVal -= 3;
        System.out.println("Subtract and Assign (-=): " + assignVal);
        assignVal *= 2;
        System.out.println("Multiply and Assign (*=): " + assignVal);
        assignVal /= 4;
        System.out.println("Divide and Assign (/=): " + assignVal);
        assignVal %= 2;
        System.out.println("Modulus and Assign (%=): " + assignVal);


        // 3. Relational / Comparison Operators (==, !=, >, <, >=, <=)
        System.out.println("\n--- 3. Relational Operators ---");
        int x = 10;
        int y = 20;
        System.out.println("Equal to (x == y): " + (x == y));
        System.out.println("Not equal to (x != y): " + (x != y));
        System.out.println("Greater than (x > y): " + (x > y));
        System.out.println("Less than (x < y): " + (x < y));
        System.out.println("Greater than or equal to (x >= y): " + (x >= y));
        System.out.println("Less than or equal to (x <= y): " + (x <= y));


        // 4. Logical Operators (&&, ||, !)
        System.out.println("\n--- 4. Logical Operators ---");
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical AND (condition1 && condition2): " + (condition1 && condition2));
        System.out.println("Logical OR (condition1 || condition2): " + (condition1 || condition2));
        System.out.println("Logical NOT (!condition1): " + (!condition1));


        // 5. Bitwise & Bit-Shift Operators (&, |, ^, ~, <<, >>, >>>)
        System.out.println("\n--- 5. Bitwise & Shift Operators ---");
        int bit1 = 5;  // Binary: 0101
        int bit2 = 3;  // Binary: 0011
        System.out.println("Bitwise AND (bit1 & bit2): " + (bit1 & bit2)); // 0001 -> 1
        System.out.println("Bitwise OR (bit1 | bit2): " + (bit1 | bit2));  // 0111 -> 7
        System.out.println("Bitwise XOR (bit1 ^ bit2): " + (bit1 ^ bit2)); // 0110 -> 6
        System.out.println("Bitwise Complement (~bit1): " + (~bit1));      // Inverts all bits
        
        int shiftVal = 2; // Binary: 0010
        System.out.println("Left Shift (shiftVal << 1): " + (shiftVal << 1));   // 0100 -> 4
        System.out.println("Right Shift (shiftVal >> 1): " + (shiftVal >> 1));  // 0001 -> 1
        
        int negativeVal = -8;
        System.out.println("Unsigned Right Shift (negativeVal >>> 2): " + (negativeVal >>> 2)); // Fills left with 0s


        // 6. Ternary Operator (? :)
        System.out.println("\n--- 6. Ternary Operator ---");
        int minVal = (x < y) ? x : y; // If true, assigns x. If false, assigns y.
        System.out.println("Ternary Result (minVal): " + minVal);


        // 7. Type Comparison Operator (instanceof)
        System.out.println("\n--- 7. Instanceof Operator ---");
        String greeting = "Hello World";
        boolean isString = greeting instanceof String;
        System.out.println("Is 'greeting' an instance of String?: " + isString);
    }
}