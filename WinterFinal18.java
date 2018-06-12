// BC CS210 Final Exam, Part A NAME:_______________________
// W.P. Iverson, instructor WINTER 2018
// #1,2,17 (30 pts), #3-16 (70 pts)
public static void main(String[] args) {
 int[] numbers = { 1, 8, 3, 2, 11, 13, 5 };

// 1. Write a method called countOdds that accepts an int[] array as a parameter
// and returns the number of odd int data in that array. Do not alter the input array
// For example:
 System.out.println( countOdds(numbers)); // returns 5

// 2. Write a method called returnOdds that accepts an int[] array as a parameter
// and returns an int[] containing only the odd int data in that array. Do not alter
// the input array. For example:
 System.out.println( Arrays.toString(returnOdds(numbers)) ); // [1, 3, 11, 13, 5]
// Recall you have: int[] numbers = { 1, 8, 3, 2, 11, 13, 5 };
 int i = 3; // initialize counter
 System.out.println( i ); // 3.
 System.out.println( numbers[3] ); // 4.
 System.out.println( numbers[i]+3 ); // 5.
 System.out.println( numbers[i+3] ); // 6.
 System.out.println( numbers[i%3]); // 7.
 System.out.println( numbers[i/3] ); // 8.
 System.out.println( numbers[numbers[i]] ); // 9.
 System.out.println( numbers.length); // 10.

 System.out.println( numbers[++i]); // 11.
 System.out.println( ++numbers[i]); // 12.

 // Carefully trace what happens in the shiftDOWN method below
 System.out.println(Arrays.toString(numbers)); // 13.
 // #13 is a free one, just copy array from top of page!

 shiftDOWN(numbers);
 // How has the array changed:
 System.out.println(Arrays.toString(numbers)); // 14.
 // shiftDOWN(args);
 // I must comment out the line above, it's illegal, won’t compile. Why?
 // 15.

 System.out.println(args.length); // I DO get zero here when using Eclipse.
 // Arrays.toString(args);
 // Can I use the args array with Arrays.toString()? Yes or No?
 // 16.

 // 17. Write a void method here called shiftUP that accepts an int[] array
// and shift data UP, for example [9,3,7,1] changes to [0,9,3,7]
 }
 // used for problems 13-16 above // 17:
 public static void shiftDOWN(int[] list) {
 for (int i = list.length-1; i > 0; i--)
 list[i-1] = list[i];
 }
// end of part A (100 pts) for final exam
public class PartB { // 10 pts per item now, even though some are very easy.
/**
* CS210 FINAL EXAM, second part
*/
public static void main(String[] args) {
// When we're done here, the code below runs without errors.
// Attached are two Classes, similar to what is in text.
ExamPoint p1 = new ExamPoint(1,2);
ExamPoint p2 = new ExamPoint(5,3);
ExamPoint p3 = new ExamPoint(); // code required with this
// 18. Write the zero parameter constructor on attached Class page,
// that make the default exam point at the origin (0,0)
System.out.println(p1);
// 19. Write a method so above System.out.println produces (0,0)
System.out.println(p2.toString());
// 20. Determine your output for above (assuming #19 is correct).
System.out.println(p3.equals(new ExamPoint(0,0))); // true
// 21. Write an equals method to tell if two points are equal
// The WholeLine class is attached, similar to one we created
// for an Exercise in the text, modified to use ExamPoint.
WholeLine line1 = new WholeLine (p1, p2);
WholeLine line2 = new WholeLine (p2, p1);
WholeLine line3 = new WholeLine (p3, p1);
// Determine output for the following four lines of code
System.out.println(line1); // 22.
System.out.println(line3); // 23.
System.out.println(line1==line2); // 24.
// Write your code on attached pages, and be certain to think about which Class
// is correct for the code you are writing. Maybe start on scratch paper.
System.out.println(line1.equals(line2)); // true
// 25. Write an equals method, on attached pages, as used above.
System.out.println(line1.getSlope());
// 26. Write a getSlope() method in the correct class (attached)
System.out.println(line1.intersects(line2)); // true
// 27. Write an intersects method, as used above, that determines
// if two line segments have a point of intersection. The equation
// y = mx + b might be handy for each line segment
}
}
// A Point object represents a pair of (x, y) coordinates.
// Final version: encapsulated and needs some help
public class ExamPoint {
 private int x;
 private int y;
 // Constructs a new point with the given (x, y) location.
 // pre: initialX >= 0 && initialY >= 0
 public ExamPoint(int initialX, int initialY) {
 setLocation(initialX, initialY);
 }
 // Returns the distance between this point and (0, 0).
 public double distanceFromOrigin() {
 return Math.sqrt(x * x + y * y);
 }
 // Returns the x-coordinate of this point.
 public int getX() {
 return x;
 }
 // Returns the y-coordinate of this point.
 public int getY() {
 return y;
 }
 // Sets this point's (x, y) location to the given values.
 // pre: newX >= 0 && newY >= 0
 public void setLocation(int newX, int newY) {
 if (newX < 0 || newY < 0) throw new IllegalArgumentException();
 x = newX;
 y = newY;
 }
}
// Adapted from Building Java Programs (.com)
// Chapter 8 Exercises
public class WholeLine {
 private double m; // slope of the whole line
 private double b; // intercept of line at y-axis
 // Constructs a new WholeLine that contains the given two Points.
 public WholeLine (ExamPoint p1, ExamPoint p2) {
 double rise = p1.getY() - p2.getY();
 m = rise / (p1.getX() - p2.getX());
b = p1.getY() - (m * p1.getX());
 }
 // Returns a String representation of this WholeLine,
 public String toString() {
 return "slope=" + m + ", intercept=" + b;
 }
}