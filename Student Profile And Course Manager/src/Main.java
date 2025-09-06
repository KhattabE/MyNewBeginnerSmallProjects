public class Main {


    public static void main(String[] args) {

        //Course objects
        Course course1 = new Course("Java programming", " CS 115", "Micheal Jackson");
        Course course2 = new Course("Cyber Security fundamentals", "IT 202", "Obama");
        Course course3 = new Course("Discrete Math and algorithms", "DMA", "Bonnet");

        //Student objects
        Student student1 = new Student("Mike", 343);
        Student student2 = new Student("Bbable", 231);

        //Enrolling student1 the course1
        student1.enrollStudentInCourse(course1);

        student1.enrollStudentInCourse(course2);

        student2.enrollStudentInCourse(course3);

        //Displays course enrolled and Student info
        student1.displayStudentInfo();
        student1.displayCourseDescription();

        student2.displayStudentInfo();
        student2.displayCourseDescription();





    }


}
