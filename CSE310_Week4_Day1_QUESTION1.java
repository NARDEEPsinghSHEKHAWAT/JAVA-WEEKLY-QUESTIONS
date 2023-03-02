import java.io.*;
import java.util.*;
import java.util.Scanner;

enum Subject {
  Java("Shruti", 4),
  OS("Puneet Kumar", 3),
  AI("James William", 2),
  Android("Md. Adil Khan", 3);

  private final String faculty;
  private final int credits;

  Subject(String faculty, int credits) {
    this.faculty = faculty;
    this.credits = credits;
  }

  public String getFaculty() {
    return this.faculty;
  }

  public int getCredits() {
    return this.credits;
  }
}

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String subject = sc.nextLine();

    try {
      Subject sub = Subject.valueOf(subject);
      System.out.println(sub.getFaculty() + " " + sub.getCredits());
    } catch (IllegalArgumentException e) {
      System.out.println("This subject is not running in this semester.");
    }
  }
}
