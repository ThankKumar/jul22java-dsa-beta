// 1. IDE - Integrated Development Environment
// 2. Course Curriculum + Notes and Codes
// 3. Java Programming Language - Template (High Level Language vs Low Level Language)
// 4. Brief Idea of Java Architecture - Compilation vs Execution, JDK -> JVM -> JavaC -> JRE 

// 5. Output in Java - System.out.print() vs System.out.println()
// Printing String Literals ("")
// Task -> 5.1. Print Hello World in one line and character by character
// Task -> 5.2. Print Z Pattern
// Task -> 5.3. Homework: Print H pattern, Print X Pattern

// 6. Arithmetic Operations - +, -, /, *, %
// Task -> 6.1. Integer Divison vs Float Division
// Task -> 6.2. Last Digit of Number
// Task -> 6.3. Homework: Second Last Digit of Number

// 7.1. Variables and Datatypes (Primitives)
// 7.2. Assignment Operation (=)
// 7.3. Arithmetic Operations on Integers and Floats
// Task -> Add 2 String Literals, Add 2 Integers, String Literal with Integer, Integer with Float


import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        // We will write the entire here 
        
//         // Output : ln = new line
//         System.out.println("Archit Aggarwal says Hello");
//         System.out.println("I am Geekster Educator.");
        
//         // Output will be in the same line
//         System.out.print("Hey, I will teach you DSA. ");
//         System.out.print("I will also teach you OOPS.");
        
        // System.out.print("Sachin");
        // System.out.println("Ramesh");
        // System.out.print("Tendulkar");
        
        // Printing Hello World Line by Line
        // System.out.println("H");
        // System.out.println("E");
        // System.out.println("L");
        // System.out.println("L");
        // System.out.println("O");
        // System.out.println();
        // System.out.println("W");
        // System.out.println("O");
        // System.out.println("R");
        // System.out.println("L");
        // System.out.println("D");
        
        // Arithmetic Operations : +, -, /, *, %
        // System.out.println(10 + 20); // Integer + Integer = Integer
        // System.out.println(10.5 + 3.7); // Float + Float = Float
        // System.out.println(10 + 20.5); // Integer + Float = Float
        // System.out.println(10.5 + 30.5);
        
        // System.out.println(30 - 10);
        // System.out.println(10 - 30);
        // System.out.println(30 - 10.5);
        // System.out.println(30.5 - 10);
        // System.out.println(30.5 - 10.5);
        
        // System.out.println(30 * 10);
        // System.out.println(10 * 30);
        // System.out.println(30 * 10.5);
        // System.out.println(30.5 * 10);
        // System.out.println(30.5 * 10.5);
        
        // Integer Division
//         System.out.println(30 / 10);
//         System.out.println(30 / 20); 
//         // Loss of Data (1.5 => .5 will be discarded)
//         System.out.println(10 / 20); 
//         // Loss of Data (0.5 => .5 will be discarded)
//         System.out.println(10 / 30); 
//         // Loss of Data (0.333 => .333 will be discarded)
        
//         // Float Divison (No Loss of Data)
//         System.out.println(30.0 / 10);
//         System.out.println(30 / 20.0);
//         System.out.println(10.0 / 20);
//         System.out.println(10.0 / 30.0);
        
        // Modulus Operation (%)
        // Division -> Remainder
        
        // Integer Modulo
//         System.out.println(30 % 10); // 30 = 10 * 3 + 0
//         System.out.println(30 % 20); // 30 = 20 * 1 + 10
//         System.out.println(10 % 20); // 10 = 20 * 0 + 10
//         System.out.println(10 % 30); // 10 = 30 * 0 + 10
//         System.out.println();
        
//         System.out.println(30 % 2); // 30 = 15 * 2 + 0
//         System.out.println(35 % 2); // 35 = 17 * 2 + 1
        
        // Odd Numbers % 2 => 1
        // Even Number % 2 => 0
        
        // System.out.println("*****");
        // System.out.println("   *");
        // System.out.println("  *");
        // System.out.println(" *");
        // System.out.println("*****");
        
        // Remainders of Nos When Divided by X => [0, X - 1]
//         System.out.println(0 % 4); // 0 = 4 * 0 + 0
//         System.out.println(1 % 4); // 1 = 4 * 0 + 1
//         System.out.println(2 % 4); // 2 = 4 * 0 + 2
//         System.out.println(3 % 4); // 3 = 4 * 0 + 3
        
//         System.out.println(4 % 4); // 4 = 4 * 1 + 0
//         System.out.println(5 % 4); // 5 = 4 * 1 + 1
//         System.out.println(6 % 4); // 6 = 4 * 1 + 2
//         System.out.println(7 % 4); // 7 = 4 * 1 + 3
        
//         System.out.println(8 % 4); // 8 = 4 * 2 + 0
//         System.out.println(9 % 4); // 9 = 4 * 2 + 1
//         System.out.println(10 % 4); // 10 = 4 * 2 + 2
//         System.out.println(11 % 4); // 11 = 4 * 2 + 3
        
        
//         System.out.println(0 % 10); // 0 = 4 * 0 + 0
//         System.out.println(1 % 10); // 1 = 4 * 0 + 1
//         System.out.println(2 % 10); // 2 = 4 * 0 + 2
//         System.out.println(3 % 10); // 3 = 4 * 0 + 3
//         System.out.println(4 % 10); // 4 = 4 * 1 + 0
//         System.out.println(5 % 10); // 5 = 4 * 1 + 1
//         System.out.println(6 % 10); // 6 = 4 * 1 + 2
//         System.out.println(7 % 10); // 7 = 4 * 1 + 3
//         System.out.println(8 % 10); // 8 = 4 * 2 + 0
//         System.out.println(9 % 10); // 9 = 4 * 2 + 1
        
//         System.out.println(10 % 10);
//         System.out.println(11 % 10);
//         System.out.println(12 % 10);
//         System.out.println(13 % 10);
//         System.out.println(14 % 10);
//         System.out.println(15 % 10);
//         System.out.println(16 % 10);
//         System.out.println(17 % 10);
//         System.out.println(18 % 10);
//         System.out.println(19 % 10);
        
//         System.out.println(130 % 10);
//         System.out.println(131 % 10);
//         System.out.println(132 % 10);
//         System.out.println(133 % 10);
//         System.out.println(134 % 10);
//         System.out.println(135 % 10);
//         System.out.println(136 % 10);
//         System.out.println(137 % 10);
//         System.out.println(138 % 10);
//         System.out.println(139 % 10);
        
//         // TO Get the Last Digit -> Remainder of Divison by 10
//         System.out.println(1038517 % 10);
        // 1038517 = 10 * 103851 + 7
        
        // 123 = 12 * 10 + 3
        
//         System.out.println(1038517 % 100);
//         System.out.println(1038517 % 1000);
        
        
        // Task: Second Last Digit from No
        // Input : 1038517 => 1
        // Input : 123456789 => 8
        
        // 1038517 => 17 => 1
        // 123456789 => 89 => 8 
        // 89 = 8 * 10 + 9
        
//         System.out.println((1038517 % 100) / 10);
//         System.out.println((123456789 % 100) / 10);
        
//         // 1038517 % 1000 = 517 / 100 = 5
//         System.out.println((1038517 % 1000) / 100);
        
//         // 123456789 % 1000 = 789 / 100 = 7
//         System.out.println((123456789 % 1000) / 100);
        
        
        // Variables (Memory)
        
        // Integer (Smaller) => 45
        // Float => 39.67
        // Character (Symbol) => 'a', 'A'
        // Boolean => true / false
        // Long => 9319117888
        // String => "Archit Aggarwal", "Geekster", "India"
        
        // Datatype variableName = value;
        // (Limits -> Min, Max), (Memory Block Size)
        
        // Declaration = Initialization
//         int marks = 90; // = is Assignment Operation
//         // Creating Marks Variable and Initialize with 90
        
//         System.out.println(marks);
        
//         marks = 100; // Updation
//         System.out.println(marks);
        
//         float percentage = 95.4f;
        
//         // float percentage = 99.8f; 
//         // This is Compilation Error (Redeclaration)
            
//         percentage = 99.8f;
//         System.out.println(percentage);
        
//         float percentage = 95.4f;
//         char initial = 'A';
//         boolean isVegetarian = false;
//         long phoneNo = 9319117888l;
        
//         System.out.println("marks");
//         System.out.println(marks);
//         System.out.println("percentage");
//         System.out.println(percentage);
//         System.out.println(initial);
//         System.out.println(isVegetarian);
//         System.out.println(phoneNo);
        
//         System.out.println(10 + 20);
//         System.out.println(20 + 20.5);
//         System.out.println(20 * 30);
        
//         int a = 10;
//         int b = 20;
//         System.out.println("a + b");
//         System.out.println(a + b);
        
//         int answer = a + b;
//         System.out.println(answer);
        
//         float c = 20.5f; 
//         // Smaller Floating Number with Less Precision
//         double d = 20.520303030; 
//         // Large Floating Number with More Precision
//         System.out.println(b + c);
//         System.out.println(c + d);
        
        
        double ans = 10 / 20;
        System.out.println(ans);
        
        int ans2 = 10 / 20;
        System.out.println(ans2);
        
        double ans3 = 10.0 / 20;
        System.out.println(ans3);
        
        int ans4 = (int)(10.0 / 20.0); 
        // Explicit Type Conversion (Float -> Int)
        
        System.out.println(ans4);
        
        // Task 1: Length as 10, Breadth as 20
        // Print Area of Rectange
        // Print Perimeter of Rectangle
        
//         int length = 10; 
//         int breadth = 20;
        
//         int area = length * breadth;
//         System.out.println(area);
        
//         int perimeter = 2 * (length + breadth);
//         System.out.println(perimeter);
        
//         // (F − 32) × 5/9 = C
//         int fahrenheit = 60;
//         double convertedCelsius = (fahrenheit - 32) * 5 / 9;
        
        
        // F = C X 9/5 + 32
        int celsius = 100;
        
    }
}

