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

    //A method with string return type, to show course description
    String courseDescription(){
        return courseCode + " " + courseName + " - " + "\nCourse Instructor: " + courseInstructor;
    }



}
