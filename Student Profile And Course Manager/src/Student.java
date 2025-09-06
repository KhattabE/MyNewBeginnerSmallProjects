import java.util.ArrayList;

public class Student {

    //Student class variables
    String name;
    int studentID;
    ArrayList<Course> enrolledCourses;


    //Student class constructor
    Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        enrolledCourses = new ArrayList<>();

    }

    //Method to enroll student in the course
    void enrollStudentInCourse(Course enrollInCourse) {
        enrolledCourses.add(enrollInCourse);

    }

    void displayStudentInfo(){
        System.out.println("Student Name: " + name + "\nStudent ID: " + studentID);
    }

    void displayCourseDescription() {
        for (int i = 0; i < enrolledCourses.size(); i++) {
            System.out.println(enrolledCourses.get(i).courseDescription());
        }


    }
}