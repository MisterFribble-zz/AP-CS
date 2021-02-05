public class Student {
  // Fields
  private String firstName;
  private String lastName;
  private int gradeLevel;
  private double gpa;
  
  private static int num;
  private int studentID;

  public Student() {
    firstName = "None";
    lastName = "None";
    gradeLevel = 0;
    gpa = 0.0;

    num++;
    studentID = num;
  }

  public Student(String fn, String ln, int gl, double gp) {
    this();
    firstName = fn;
    lastName = ln;
    if(gl >= 0 && gl <= 12) {
      gradeLevel = gl;
    }
    if(gp >= 0 && gp <= 4.5) {
      gpa = gp;
    }
  }

  // toString() method
  public String toString() {
    return lastName + ", " + firstName +
    "\nGPA: " + gpa +
    "\nGrade Level: " + gradeLevel + " id # " + studentID;
  }
}
