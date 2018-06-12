public class WholeLine {
 private double m; // slope of the whole line
 private double b; // intercept of line at y-axis
 // Constructs a new WholeLine that contains the given two Points.
 public WholeLine (ExamPoint p1, ExamPoint p2) {
 double rise = p1.getY() - p2.getY();
 m = rise / (p1.getX() - p2.getX());
b = p1.getY() - (m * p1.getX());
 }