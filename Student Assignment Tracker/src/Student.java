import java.util.ArrayList;

public class Student {

    //Student class variables
    private String studentName;
    private int studentID;
    private ArrayList<Assignment> assignments;


    //Class constructor
    Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        assignments = new ArrayList<>();

    }

    //Getter method to make the field readable
    public String getStudentName(){
        return this.studentName;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }


    //Setter method to make the field writable
    void setStudentName(String studentName){
        this.studentName = studentName;
    }

    void setStudentID(int studentID){
        this.studentID = studentID;
    }

    void setAssignments(ArrayList<Assignment> assignments){
        this.assignments = assignments;
    }

    //Method to add assignments
    void addAssignment(Assignment a){

    }

    void displayAllAssignments(){

    }

    void displayAssignmentInfo(){

    }


}
