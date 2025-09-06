public class Course {

    //Course Class variables
    String courseName;
    String courseCode;
    String courseInstructor;


    //Course constructor
    Course(String courseName, String courseCode, String courseInstructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseInstructor = courseInstructor;

    }


    String courseDescription(){
        return courseCode + " " + courseName + " - " + "Course Instructor: " + courseInstructor;
    }



}
