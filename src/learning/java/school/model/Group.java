package learning.java.school.model;

class Group {
    private Professor professor;
    private int availability;
    private Student[] students;

    Group(int availability) { //constructor
        this.availability = availability;
        students = new Student[availability];
    }

    public Group(int i, Professor professor) {


    }


    public Professor getProfessor() {
        return professor;
    }

    public int getAvailability() {
        return availability;
    }

    public int getEnrolled() {
        return availability;
    }

    public Group[] printStudentsList() {
        return null ;
    }

    public void addStudent(Student student) {

    }

    public void setProfessor(Professor professor) {
        this.professor = professor;

    }
}
