
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
// Task -> 6.2. Last Digit of Number (Modulus By 10)
// Task -> 6.3. Modulus by 2 (Odd or Even)
// Task -> 6.4. Modulus by X -> Remainder [0, X-1]
// Task -> 6.5. Homework: Second Last Digit of Number

// 7.1. Variables and Datatypes (Primitives)
// 7.2. Assignment Operation (=)
// 7.3. Declaration, Initialization and Updation
// 7.4. Arithmetic Operations on Integers and Floats
// 7.5. Implicit Type Conversion VS Explicit Type Conversion
// 7.6. Add 2 String Literals, Add 2 Integers, String Literal with Integer
// 7.7. Perimeter and Area of Rectangle
// 7.8. Farhenheit to Celsius and Vice Versa

// 8) Taking Inputs -> String (Word vs Sentence), Integer, Double, Etc

// 9.1        Store these expressions inside a Boolean variable ans. Print their outputs true or false accordingly:
// a.        2 + 3 > 5
// b.        40+5 > 72
// c.        78+93 >= 100
// d.        40+3 < 50
// e.        90+91 <= 181
// f.        5==5
// g.        15==20
// h.        15==3*5
// i.        15==3*6
// j.        3!=3
// k.        4!=10
// l.        3*4 + 8*9 == 45
// m.        2*3 + 4*5 != 5*4 + 7/5
// n.        13/2==13.0/2
// o.        15.0/2 + 7 == 14.5

// 9.2) Take an input x and check if the entered number is greater than 100 or not. Print true or false.
// 9.3) Take three inputs and check if the sum of these is smaller than 100 or not. Print true or false.
// 9.4) Take four inputs x, y, z, w and check if x*y is equal to z*w or not. Print true or false.
// 9.5) Take an input and check if the number is even or not. Print true or false.
// 9.6) Take a number as input. Check if number lies between 100-999 or not. Print true or false.

// 10) AND, OR, NOT, >=, <=, >, <, == Operations
// 10.1.        boolean ans= 3>2 && 14>3
// 10.2.        boolean ans = 40>3 && 40 > 50
// 10.3.        boolean ans = 40>=40 || 50>=2*25
// 10.4.        boolean ans = (2*3==4 && 6*4==9) || (4>2)
// 10.5.        boolean ans = (4>5) && (3>5 && 80==2*40) 
// 10.6.        boolean ans = (20*5==100 || 10==10) && (30*2==60 || 40>30)
// 10.7.        boolean ans = !(30>20)
// 10.8.        boolean ans = !(30==30)
// 10.9.        boolean ans = !(30≥20 || 40≥10)
// 10.10.        boolean ans = !( (20*4 + 40 ≥100 || 20==10) && (3*2<=60 || 4≥30) )
// 10.11.        boolean ans = !( 20%3==2 )
// 10.12.        boolean ans = ( !(40==40) && 80>36)
// 10.13.        boolean ans = ( !(50>20) || 90>2*45) && ( 30!=2*15)

import java.lang.*; // Language (Primitives - int, float, etc)
import java.util.*; // Utilities (Collection Framework)
import java.io.*; // Input - Output (Printing, Taking Inputs)

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
//         System.out.println(4 % 10); // 4 = 4 * 1 + 4
//         System.out.println(5 % 10); // 5 = 4 * 1 + 5
//         System.out.println(6 % 10); // 6 = 4 * 1 + 6
//         System.out.println(7 % 10); // 7 = 4 * 1 + 7
//         System.out.println(8 % 10); // 8 = 4 * 2 + 8
//         System.out.println(9 % 10); // 9 = 4 * 2 + 9
        
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
        
        
        // Variables & Datatypes (Memory)
        
        // Integer (Smaller) => 45
        // Float, Double => 39.67
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
        
        
//         double ans = 10 / 20;
//         // Implicit Type Conversion (Int -> Double)
//         System.out.println(ans);
        
//         int ans2 = 10 / 20;
//         System.out.println(ans2);
        
//         double ans3 = 10.0 / 20;
//         System.out.println(ans3);
        
//         int ans4 = (int)(10.0 / 20.0); 
//         // Explicit Type Conversion (Double -> Int)
        
//         System.out.println(ans4);
        
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
        // int fahrenheit = 60;
        // double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
        // System.out.println(celsius);
        
        // F = C X 9/5 + 32
        // int celsius = 63;
        // double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        // System.out.println(fahrenheit);
        
        // 23rd July
        // Comparison Operations (>=, >, <=, <, ==, !=)
        // Binary Operation: 2 Operands
        // Result : True or False
//         System.out.println(20 >= 10);
//         System.out.println(20 <= 10);
//         System.out.println(10 >= 10);
//         System.out.println(10 <= 10);
//         System.out.println();
//         System.out.println(20 > 10);
//         System.out.println(20 < 10);
//         System.out.println(10 > 10);
//         System.out.println(10 < 10);
        
//         int marks = 10; // = -> Assignment Operator
//         System.out.println(marks == 10); 
//         // = Comparison or Equality Operation
//         System.out.println(10 == 10);
        
//            System.out.println(10 == 10); // true
//            System.out.println(20 == 10); // false
        
//            System.out.println(10 != 10); // false
//            System.out.println(20 != 10); // true
           
        
        // System.out.println(2+3 > 5);
        // System.out.println(40+5 > 72);
        // System.out.println(78+93 >= 100);
        // System.out.println(40+3 < 50);
        // System.out.println(40+5 > 72);
        // System.out.println(5==5);
        // System.out.println(15==3*5);
        
        // System.out.println(3!=3);
        // System.out.println(4!=10);
        
        // System.out.println(3*4 + 8*9 == 45); 
        // // 12 + 72 == 45 : F
        // System.out.println(2*3 + 4*5 != 5*4 + 7/5); 
        // // 6 + 20 != 20 + 1: T
        // System.out.println(13/2 == 13.0/2);
        // // 6 == 6.5  : F
        // System.out.println(15.0/2 + 7 == 14.5);
        // // 7.5 + 7 == 14.5 : T
        
        // GOOD IN EVERYTHING OR PERFECT IN ONE THING
        
//         // Directly Printing "10 + 20"
//         System.out.println("10 + 20");
        
//         // Concatenation vs Addition Operations
//         // Integer + Integer => Addition Operation
//         System.out.println(10 + 20);
        
//         // String + String => Concatenation or Joining
//         System.out.println("Archit" + "Aggarwal");
//         System.out.println("10" + "20");
        
//         // Integer + String
//         System.out.println(10 + "Archit");
//         // String + Integer
//         System.out.println("Archit" + 10);
        
//         // String + Integer + Integer
//         System.out.println("Archit" + 10 + 20);
//         // Concatenation + Concatenation
        
//         // Integer + Integer + String
//         System.out.println(10 + 20 + "Archit");
//         // Addition (10 + 20) + Concatenation
        
//         // // Integer + String + Integer
//         System.out.println(10 + "Archit" + 20);
//         // Concatenation + Concatenation
    }
}



